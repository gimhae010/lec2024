import React, { useEffect, useState } from 'react'
import FormGroup from './components/FormGroup'
import { Link, useLocation, useParams } from 'react-router-dom'
import { Button, Form } from 'react-bootstrap';

function DeptEdit() {
    const location=useLocation();
    const [deptno,setDept]=useState(0);
    const [bean,setBean]=useState(null);
    useEffect(()=>{
      setDept(location.search.split('=')[1]);
    },[]);
    useEffect(()=>{
      if(deptno!=0)
        fetch(`http://localhost:3030/dept/${deptno}`)
        .then(res=>res.json())
        .then(json=>setBean(json))
        .catch(alert)
    },[deptno]);
  return (
    <>
        <h2>edit page</h2>
        <form>
            <FormGroup label={'deptno'} name={'deptno'} val={bean!=null?1111:''}/>
            <FormGroup label={'dname'} name={'dname'} val={bean!=null?bean.DNAME:''}/>
            <FormGroup label={'loc'} name={'loc'} val={bean!=null?bean.LOC:''}/>
            <Button>수정</Button>
        </form>
    </>
  )
}

export default DeptEdit
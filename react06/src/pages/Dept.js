import React, { useEffect, useState } from 'react'
import FormGroup from './components/FormGroup'
import { Link, useParams } from 'react-router-dom'
import { Button } from 'react-bootstrap';

function Dept() {
    const {deptno}=useParams();
    const [bean,setBean]=useState(null);
    useEffect(()=>{
        fetch(`http://localhost:3030/dept/${deptno}`)
        .then(res=>res.json())
        .then(json=>setBean(json))
        .catch(alert)
    },[]);
  return (
    <>
        <h2>detail page</h2>
        <form>
            <FormGroup label={'deptno'} name={'deptno'} val={bean!=null?deptno:''}/>
            <FormGroup label={'dname'} name={'dname'} val={bean!=null?bean.DNAME:''}/>
            <FormGroup label={'loc'} name={'loc'} val={bean!=null?bean.LOC:''}/>
        </form>
        <Link to={'/dept/edit?deptno='+deptno} className='btn btn-primary btn-block' role='button'>수정</Link>
    </>
  )
}

export default Dept
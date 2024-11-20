import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom'
import FormInput from './components/FormInput';

function Dept() {
  const {deptno}=useParams();
  const [bean,setBean]=useState(null);
  
  useEffect(()=>{
    console.log(bean);
    fetch('http://localhost:3030/dept/'+deptno)
    .then(e=>e.json())
    .then(data=>{
        console.log(bean);
        setBean({...data});
        
    console.log(bean);
    }).catch(err=>{
        alert(err);
    });
  },[]);

  return (
    <>
    <h2>Dept detail{deptno}</h2>
    <form>
        <FormInput ref={null} name={'deptno'} value={bean?bean.DEPTNO:''}/>
        <FormInput ref={null} name={'dname'} value={bean?bean.DNAME:''}/>
        <FormInput ref={null} name={'loc'} value={bean?bean.LOC:''}/>
    </form>
    </>
  )
}

export default Dept
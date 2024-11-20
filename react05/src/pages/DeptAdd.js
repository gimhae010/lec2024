import React, { useRef, useState } from 'react'
import { useNavigate } from 'react-router-dom'
import FormInput from './components/FormInput';

function DeptAdd() {
  const [inputVals,setInputVals]=useState({deptno:'',dname:'',loc:''});
  const navigate=  useNavigate();
  const refInp1=useRef();
  const refInp2=useRef();
  const refInp3=useRef();
  const deptSend=e=>{
    e.preventDefault();
    fetch('http://localhost:3030/dept/',{
        method:'POST',
        body:JSON.stringify({deptno:refInp1.current.value,dname:refInp2.current.value,loc:refInp3.current.value}),
        headers:{
            'Content-Type':'application/json'
        }
    }).then(e=>{
        if(e.ok) 
            navigate('/dept/');
    }).catch(err=>{
        alert(err);
    });

  };
//   const editVal=e=>{
//     if(e.target.name=='deptno')
//         setInputVals({...inputVals,deptno:e.target.value});
//     if(e.target.name=='dname')
//         setInputVals({...inputVals,dname:e.target.value});
//     if(e.target.name=='loc')
//         setInputVals({...inputVals,loc:e.target.value});
//   };
  return (
    <>
        <h2 className='page-header'>입력 페이지</h2>
        <form onSubmit={deptSend}>
            {/* 
            <FormInput ref={refInp1} name='deptno' val={inputVals.deptno} editVal={editVal}/>
            <FormInput ref={refInp2} name='dname' val={inputVals.dname} editVal={editVal}/>
            <FormInput ref={refInp3} name={'loc'} val={inputVals.loc} editVal={editVal}/> 
            */}

            <FormInput ref={refInp1} name='deptno'/>
            <FormInput ref={refInp2} name='dname'/>
            <FormInput ref={refInp3} name={'loc'}/>
            <div className='form-group'>
                <button type='submit' className='btn btn-primary btn-block'>입력</button>
                <button type='reset' className='btn btn-default btn-block'>취소</button>
                <button type='button' className='btn btn-default btn-block' onClick={navigate(-1)}>뒤로</button>
            </div>
        </form>
    </>
  )
}

export default DeptAdd
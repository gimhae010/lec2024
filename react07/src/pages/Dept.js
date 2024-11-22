import React, { useEffect, useState } from 'react'
import { Link, useParams } from 'react-router-dom'

function Dept() {
    const {deptno}=useParams();
    const [bean,setBean]=useState(null);
    const [editable,setEditable]=useState(false);
    useEffect(()=>{
        fetch('http://localhost:8080/dept/'+deptno,{
            method:'GET',
            credentials:'include'
        })
        .then(res=>res.json()).then(json=>setBean(json)).catch(alert);
    },[]);
  return (
    <>
        <nav>
            <Link to={'/'}>home</Link>{'    '}
            <Link to={'/intro'}>intro</Link>{'    '}
            <Link to={'/dept/'}>dept</Link>{'    '}
            <Link to={'/login/'}>login</Link>
        </nav>
        <div className='container'>
            <h2>{editable?'edit':'detail'} page</h2>
            <form>
                <div>
                    <input name='deptno' value={bean==null?'':bean.deptno} readOnly={true}/>
                </div>
                <div>
                    <input name='dname' value={bean==null?'':bean.dname} readOnly={editable}/>
                </div>
                <div>
                    <input name='loc' value={bean==null?'':bean.loc} readOnly={editable}/>
                </div>
                <div>
                    <button type='submit'>수정</button>
                </div>
            </form>
        </div>
    </>
  )
}

export default Dept
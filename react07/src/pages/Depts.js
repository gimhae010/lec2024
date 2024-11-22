import React, { useEffect, useState } from 'react'
import { Link } from 'react-router-dom'

function Depts() {
    const [arr,setArr]=useState([]);
    useEffect(()=>{
        fetch('http://localhost:8080/dept/',{
            method:'GET',
            credentials:'include'
        })
        .then(res=>res.json())
        .then(json=>setArr(json))
        .catch(alert)
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
            <h2>list page</h2>
            {arr.map(ele=>(
            <Link to={'/dept/'+ele.deptno}>
            <dl>
                <dt>{ele.dname}</dt>
                <dd>{ele.loc}</dd>
            </dl>
            </Link>
        ))}
        </div>
    </>
  )
}

export default Depts
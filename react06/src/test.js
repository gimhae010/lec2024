import axios from 'axios';
import React from 'react'

function test() {
    const func1=()=>{
        // fetch('http://localhost:8080/test/login',{
        //     method:'POST'
        //     // ,body:JSON.stringify({id:'admin',pw:'1234'}),
        //     ,body:"id=admin&pw=1234",
        //     credentials:'include',
        //     mode: 'no-cors',
        //     headers:{
        //         // 'Content-Type':'application/json'
        //         'Content-Type': 'application/x-www-form-urlencoded'
        //     }
        // }).then(console.log).catch(console.log)
        axios.post('http://localhost:8080/test/login',{
            credentials:'include', body:"id=admin&pw=1234"
        }).then(e=>console.log(e));
    };
    const func2=()=>{
        fetch('http://localhost:8080/test/login').then().catch(console.log)
    };
    const func3=()=>{
        fetch('http://localhost:8080/dept/',{
            method:'GET',
            credentials:'include',
            mode: "cors",
            referrerPolicy: "origin-when-cross-origin"
        }).then(e=>e.text()).then(console.log).catch(console.log)
        // axios.get('http://localhost:8080/dept/').then(e=>console.log(e));
    };
  return (
    <>
        <button onClick={func1}>btn1</button>
        <button onClick={func2}>btn2</button>
        <button onClick={func3}>btn3</button>
    </>
  )
}

export default test
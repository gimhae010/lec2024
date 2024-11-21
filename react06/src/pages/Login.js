import React from 'react'
import FormGroup from './components/FormGroup'

function Login() {
    const loginAction=(e)=>{
        e.preventDefault();
        const [id,pw]=([e.target.id.value,e.target.pw.value]);
        const bean={id,pw};
        console.log(bean);
        fetch('http://localhost:3030/login/',{
            method:'POST',
            // body:JSON.stringify(bean),
            mode:'no-cors',
            credentials:'include',
            referrerPolicy:'origin-when-cross-origin',
            headers:{
                'Content-Type':'application/json'
            }
        }).then(res=>res.json()).then(console.log).catch(alert);
    };
  return (
    <>
        <h2>login page</h2>
        <form onSubmit={loginAction}>
            <FormGroup label={'id'} name={'id'}/>
            <FormGroup label={'pw'} name={'pw'}/>
            <button type='submit'>로그인</button>
        </form>
    </>
  )
}

export default Login
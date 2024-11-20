import React, { useState } from 'react'

function FormInput({ref,name}) {
    const [val,setVal]=useState('');
    return (
    <div className='form-group'>
        <input ref={ref} name={name} placeholder={name} value={val} onChange={e=>{setVal(e.target.value)}} className='form-control'/>
    </div>
  )
}

export default FormInput
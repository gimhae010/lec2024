import React, { useState } from 'react'

function FormInput({ref,name,value}) {
    return (
    <div className='form-group'>
        <input ref={ref} name={name} placeholder={name} value={value} className='form-control'/>
    </div>
  )
}

export default FormInput
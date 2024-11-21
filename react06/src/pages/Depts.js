import { AgGridReact } from 'ag-grid-react';
import React, { useEffect, useState } from 'react'
import { Button, Stack } from 'react-bootstrap'
// book p187 변경
import 'ag-grid-community/styles/ag-grid.css';
import 'ag-grid-community/styles/ag-theme-alpine.css';
import 'ag-grid-community/styles/ag-theme-balham.css';
import 'ag-grid-community/styles/ag-theme-material.css';
import 'ag-grid-community/styles/ag-theme-quartz.css';

function Depts() {
    const [arr,setArr]=useState([]);

    useEffect(()=>{
        fetch('http://localhost:3030/dept/')
        .then(res=>res.json())
        .then(json=>{
            // const result2= json.result.map(ele=>{
            //     let arr=Object.entries(ele);
            //     console.log(arr);
            //     arr[0]=arr[0].toString().toLowerCase();
            //     let obj={};
            //     obj[arr[0]]=arr[1];
            //     return obj;
            // })
            // console.log(result2);
            setArr(json.result);
        });
    },[]);
    const columes=[
        {field:'DEPTNO',sortable:true},
        {field:'DNAME',filter:true},
        {field:'LOC',filter:true}
    ];
  return (
    <>
    <h2>list page</h2>
    <Stack gap={2} className="col-md-10 mx-auto">
        <div className='ag-theme-balham' style={{height:500,width:'100%'}}>
            <AgGridReact
                rowData={arr}
                columnDefs={columes}
            />
        </div>
    </Stack>
    <Stack gap={2} className="col-md-10 mx-auto">
        <Button as="a" variant="primary">입력</Button>
    </Stack>
    </>
  )
}

export default Depts
import React, { useEffect, useState } from 'react'

function Main() {
  const [list,setList]=useState([]);

  useEffect(()=>{
    fetch('http://localhost:8080/dept/')
    .then(e=>e.json())
    .then(json=>{
      const arr=json.map(ele=>{
        return (<tr>
          <td>{ele.deptno}</td>
          <td>{ele.dname}</td>
          <td>{ele.loc}</td>
        </tr>);
      });
      setList(arr);
    });
  },[]);

  return (
    <>
    <div>List page</div>
    <table>
      <thead>
        <tr>
          <th>deptno</th>
          <th>dname</th>
          <th>loc</th>
        </tr>
      </thead>
      <tbody>{list}</tbody>
    </table>
    </>
  )
}

export default Main
const mysql = require('mysql2');
const express =require('express');
const router=express.Router();
const info={
    host: 'localhost',
    user: 'scott',
    password: 'tiger',
    database: 'xe'
  };

router.get('/',(req,res)=>{
    const connection = mysql.createConnection(info);
    connection.connect();
    connection.query('select * from dept', (err, rows, fields) => {
          if (err) throw err
          res.json({'result':rows});      
    });
    connection.end();
});

router.post('/',(req,res)=>{
    const {deptno,dname,loc}=(req.body);
    const connection = mysql.createConnection(info);
    connection.connect();
    connection.query(`insert into dept values (${deptno},'${dname}','${loc}')`, (err, rows) => {
          if (err) throw err      
          res.status(201);
          res.end();
    });
    connection.end();
});

router.get('/:deptno',(req,res)=>{
    const {deptno}=(req.params);
    const connection = mysql.createConnection(info);
    connection.connect();
    connection.query(`select * from dept where deptno=${deptno}`, (err, rows, fields) => {
          if (err) throw err
          res.json({...rows[0]});      
    });
    connection.end();
});



module.exports=router;
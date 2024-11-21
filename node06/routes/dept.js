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
    console.log('list',req.session);
    if(req.session.user=='admin'){
        const connection = mysql.createConnection(info);
        connection.connect();
        connection.query('select * from dept', (err, rows, fields) => {
            if (err) throw err
            res.header('Access-Control-Allow-Credentials','true');
            res.json({'result':rows});      
        });
        connection.end();
    }else{
        res.header('Access-Control-Allow-Credentials','true');
        res.json({result:''});
    }
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

router.put('/:deptno',(req,res)=>{
    const {deptno}=(req.params);
    const {DNAME,LOC}=req.body;
    const connection = mysql.createConnection(info);
    connection.connect();
    connection.query(`update dept set dname='${DNAME}', loc='${LOC}' where deptno=${deptno}`, (err, rows, fields) => {
          if (err) throw err
          if(rows.affectedRows>0)
            res.status(200).end();      
        else{
              res.status(400).end();      
          }
    });
    connection.end();
});


router.delete('/:deptno',(req,res)=>{
    const {deptno}=(req.params);
    const connection = mysql.createConnection(info);
    connection.connect();
    connection.query(`delete from dept where deptno=${deptno}`, (err, rows, fields) => {
          if (err) throw err
          if(rows.affectedRows>0)
            res.status(200).end();      
        else{
              res.status(400).end();      
          }
    });
    connection.end();
});

module.exports=router;
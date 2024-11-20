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



module.exports=router;
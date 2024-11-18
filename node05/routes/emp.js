const express = require('express');
const router=express.Router();
const pool=require('../modules/mysql');

router.all('/',(req,res,next)=>{
    if(!req.session.login){
        res.redirect('/login/');
    }else{
        next();
    }
});

router.get('/',(req,res)=>{

    pool.getConnection((err,conn)=>{
        // console.log(conn);
        conn.query('select * from emp',(err2,result)=>{
            // console.log(result);
            res.render('emp/index',{result});
            conn.release();
        });
    });


    // pool.query("select * from emp",(err,result,fil)=>{
    //     //console.log(err,result,fil.map(obj=>obj.name.toLowerCase()));
    //     res.render('emp/index',{result});
    // });

    // // import mysql from 'mysql2/promise';
    // // async (req,res)=>
    // const conn = await pool.getConnection();
    // try {
    // // For pool initialization, see above
    // const [rows, fields] = await pool.query("select * from emp");
    // res.render('emp/index',{result:rows});
    // // Connection is automatically released when query resolves
    // } catch (err) {
    //     console.log(err);
    // }

});

router.get('/add',(req,res)=>{
    res.render('emp/add');
});

router.post('/',(req,res)=>{
    // console.log(req.body); // post data
    // console.log(req.query); // ?id=
    // console.log(req.params); // pathvar
    const {empno,ename,sal}=(req.body);
    const sql=`insert into emp (empno,ename,sal,hiredate) values (${empno},'${ename}',${sal},now())`;
    pool.getConnection((err,conn)=>{
        conn.query(sql,err2=>console.log(err2));
        conn.release();
        res.redirect('./');
    });
});

router.get('/:empno',(req,res)=>{
    const {empno}=(req.params);
    const sql='select * from emp where empno=?';
    pool.getConnection((err,conn)=>{
        conn.query(sql,[empno],(err2,result)=>{
            conn.release();
            res.render('emp/detail',{...result[0]});
        });
    });
});


module.exports=router;
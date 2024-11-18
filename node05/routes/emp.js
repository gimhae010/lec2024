const express = require('express');
const router=express.Router();
const pool=require('../modules/mysql');

router.get('/',(req,res)=>{
    pool.getConnection((err,conn)=>{
        console.log(conn);
        conn.query('select * from emp',(err2,result)=>{
            console.log(result);
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



module.exports=router;
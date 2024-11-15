const express=require('express');
const mysql=require('mysql2');
const router=express.Router();

const info={
    host:'localhost',
    user:'scott',
    password:'tiger',
    database:'xe'
};

router.get('/', (req, res) => {
    // const arr=[];
    // for(var i=1; i<6; i++)
    //     arr.push({deptno:i,dname:'user'+i,loc:'test'});
    const sql="select * from dept order by deptno desc";
    const conn=mysql.createConnection(info);
    const callback=err=>{
        if(err) throw err;
        conn.query(sql,[],(err,result)=>{
            res.render('dept/list',{msg:'dept info',depts:result});
            conn.end();
        });
    };
    conn.connect(callback);

})

router.get('/add',(req,res)=>{
    res.render('dept/add')
});

router.post('/',(req,res)=>{

    res.redirect('./');
});

module.exports=router;
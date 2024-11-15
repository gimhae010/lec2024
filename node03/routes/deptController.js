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
    const sql="select * from dept order by deptno asc";
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
    const {deptno,dname,loc}=req.body;
    const sql=`insert into dept values (${deptno},'${dname}','${loc}')`;
    const conn=mysql.createConnection(info);
    conn.connect(err=>{
        if(err) throw err;
        conn.query(sql,err2=>{
            console.log(err2);
            conn.end();
            res.redirect('./');
        });
    });
});

router.get("/detail",(req,res)=>{
    const deptno=Number(req.query.deptno);
    const sql=`select * from dept where deptno=?`;
    const conn=mysql.createConnection(info);
    conn.connect(err=>conn.query(sql,[deptno],(err2,result)=>{
        const {DEPTNO,DNAME,LOC}=result[0];
        res.render('dept/detail',{readonly:'readonly',title:'detail',deptno:DEPTNO,dname:DNAME,loc:LOC});
    }));
});

router.get("/edit",(req,res)=>{
    const deptno=Number(req.query.deptno);
    const sql=`select * from dept where deptno=?`;
    const conn=mysql.createConnection(info);
    conn.connect(err=>conn.query(sql,[deptno],(err2,result)=>{
        const {DEPTNO,DNAME,LOC}=result[0];
        res.render('dept/detail',{readonly:null,title:'update',deptno:DEPTNO,dname:DNAME,loc:LOC});
    }));
});


router.put("/edit",(req,res)=>{
    console.log(req.body);
    const {deptno,dname,loc}=req.body;
    const sql=`update dept set dname=?,loc=? where deptno=?`;
    const conn=mysql.createConnection(info);
    conn.connect(err=>conn.query(sql,[dname,loc,deptno],(err,result)=>{
        res.json({err,result:result.affectedRows});
    }));
});

router.delete('/',(req,res)=>{
    const {deptno}=req.body;
    const sql=`delete from dept where deptno=${deptno}`;
    const conn=mysql.createConnection(info);
    conn.connect(err=>err?console.log(err):conn.query(sql,err2=>res.json({result:'success'})));
});


module.exports=router;
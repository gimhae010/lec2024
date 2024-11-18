const express =require('express');
const router=express.Router();
// const session=require('express-session');

router.get('/',(req,res)=>{
    console.log(req.session);
    res.render('login/index');
});

router.post('/',(req,res)=>{
    const {deptno,dname}=req.body;
    if(deptno=='1111' && dname=='tester'){
        req.session.login=true;
    }
    res.redirect('/');
});

module.exports=router;
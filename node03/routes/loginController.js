
const express=require('express');
const router=express.Router();


router.get('/',(req,res)=>res.render('login/login'));
router.post('/',(req,res)=>{
    const {dname,loc}=req.body;
    console.log(req.session);
    if(dname=='admin'&&loc=="1234"){
        req.session.login=dname;
        req.session.cookie.expires = new Date(Date.now() -1111);
    }
    res.redirect('/');
});


module.exports=router;
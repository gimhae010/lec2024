const express = require('express');
const router=express.Router();

router.get('/',(req,res)=>{
    res.render('emp/index');
});



module.exports=router;
var express = require('express');
var router = express.Router();

/* GET users listing. */
router.post('/',(req,res)=>{
  // const {id,pw}=req.body;
  // console.log(req.session,req.body);
  // if(id=='admin' && pw=='1234'){
    req.session.user='admin';
    res.header('Access-Control-Allow-Credentials','true');
    res.json({id:'admin'});
  // }else{
  //   res.header('Access-Control-Allow-Credentials','true');
  //   res.status(400).end();
  // }
});

router.get('/', function(req, res, next) {
  req.session.cookie.expires = new Date(Date.now() -6001);
  res.status(200).end();
});

router.get('/test', function(req, res, next) {
  console.log(req.session,req.session.user);
  res.header('Access-Control-Allow-Credentials','true');
  res.json({result:req.session});
});

module.exports = router;

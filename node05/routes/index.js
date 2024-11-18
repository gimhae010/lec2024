var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  console.log(req.session,req.session.login);
  res.render('index', { title: 'Express' ,login:req.session.login?req.session.login:false});
});
router.get('/intro', function(req, res, next) {
  res.render('intro');
});

module.exports = router;

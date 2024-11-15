const express = require('express');
const router=express.Router();
const fs=require('fs');

router.get('/', (req, res) => {
    console.log(req.session.login);
    res.render('index');
})
router.get('/intro', (req, res) => {
    res.setHeader('Content-type','application/json')
    res.send('{"key1":"val1"}')
})
router.get('/intro2', (req, res) => {
    res.json({key1:'val1',key2:'val2'});
})
router.get('/intro3', (req, res) => {
    res.redirect('/');
})
router.get('/download', (req, res) => {
    // const msg=fs.readFileSync('deptController.js',{encoding:'utf-8'});
    res.sendFile('C:\\workspace\\node03\\public\\imgs\\logo.png',e=>console.log(e));
})
router.get('/intro4', (req, res) => {
    res.sendStatus(200);
})

module.exports=router;

/*
Method              Description
res.download()      Prompt a file to be downloaded.
res.end()           End the response process.
res.send()          Send a response of various types.
res.json()          Send a JSON response.
res.jsonp()         Send a JSON response with JSONP support.
res.redirect()      Redirect a request.
res.render()        Render a view template.
res.sendFile()      Send a file as an octet stream.
res.sendStatus()	Set the response status code and send its string representation as the response body.


*/
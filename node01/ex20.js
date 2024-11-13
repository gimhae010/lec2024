const os =require('os');
const path =require('path');
const fs =require('fs');

// console.log(fs);
// fs.mkdir(path.join(__dirname,'test02'),function(e){console.log(e);});
// fs.rmdir(path.join(__dirname,'test02'),function(e){console.log(e);});
// fs.rm(path.join(__dirname,'test02','test.txt'),function(e){console.log(e);});

// console.log(fs.readdirSync(__dirname,function(e){console.log(e);}));
fs.readdir('c:\\',{encoding:'utf-8'},function(err,data){
    if(err) throw err;
    console.log(data);
});
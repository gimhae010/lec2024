const fs=require('fs');

const rs=fs.createReadStream('./ex01.js',{encoding:'utf-8'});
rs.on('data',function(data){
    console.log(data);
});
rs.on('end',function(){
    console.log('여기까지');
});



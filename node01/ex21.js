const fs=require('fs');

fs.watchFile('./ex01.js',function(){
    console.log('event...');
});

const result=fs.writeFileSync('./ex01.js','//js작성',{encoding:'utf-8'});
console.log(result);

// const msg=fs.readFileSync('./ex01.js',{encoding:'utf-8'});
// console.log(msg);
const fs=require('fs');


fs.watchFile('./ex01.js',function(){
    console.log('event...');
});

const func=(async function(){

    await fs.writeFile('./ex01.js','// javascript 로 작성',function(e){if(e)console.log(e);});
    
    await fs.readFile('./ex01.js',{encoding:'utf-8'},function(err,data){
        if(err){
            throw err;
        }
        console.log(data);
    });
});

func();
    

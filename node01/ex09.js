function func1(){}
const func2=function(){};
const func3=()=>{};

function func11(a){}
const func12=function(a){};
const func13=(a)=>{};
const func14=a=>{};

function func21(a,b){}
const func22=function(a,b){};
const func23=(a,b)=>{};
// const func24=a,b=>{};안됨

function func31(){return 'result';}
const func32=function(){return 'result';};
const func33=()=>{return 'result';};
const func34=()=>'result';
const func35=()=>console.log('test');

const func41=function(){
    console.log(this);
};
const func42=()=>console.log(this); 
func41();
func42();
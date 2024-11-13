const arr1=['item1','item2',{key1:'val1'}];
let a=arr1[0];
let b=arr1[1];
let c=arr1[2];
console.log(a,b,c);
// let [d,e,f] =arr1;
// console.log(d,e,f);
let [d,,{key1}] =arr1;
console.log(d,key1);

const obj={'key11':'val1','key12':'val2'};
let {key11,key12}=obj;
console.log(key11,key12);
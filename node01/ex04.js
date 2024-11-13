let a='key2';
let arr1={'key1':'val1',a:'val2'};
console.log(arr1[a]);
console.log(arr1.a);

let arr2={key1:'val1',key2:'val2'};
console.log(arr2['key1']);
console.log(arr2.key1);

// json 키는 문자열 ""
let msg=JSON.stringify(arr2);
console.log(msg);
let b=2222;
let c=3333;
let arr3={a,b,c,arr2};
console.log(arr3);
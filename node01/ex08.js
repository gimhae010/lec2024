const arr1=[1111,2222,3333,4444,5555];

// const result1=arr1.map((ele,idx,th)=>{
//     console.log(ele,idx,th);
//     return ele+1;
// });
// console.log(result1);

// const result2=arr1.filter(function(ele){
//     return ele%2==0;
// });
// console.log(result2);

// //모두가 true -> true
// const result3=arr1.every(function(ele){return ele%2==0;});
// //모두가 false -> false
// const result4=arr1.some(function(ele){return ele%2==0;});
// console.log(result3,result4);

const result5=arr1.reduce(function(a,b,c,d){
    // a==이전 리턴값, b==next ,c==index, d == this
    console.log(a,b);
    return a+b;
});
console.log(result5);
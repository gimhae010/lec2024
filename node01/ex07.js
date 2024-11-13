const arr1=['item1','item2','item3','item4','item5'];
// for(let i=0; i<arr1.length; i++){
//     console.log(arr1[i]);
// }

// for(idx in arr1){
//     console.log(arr1[idx]);
// }

// for(ele of arr1){
//     console.log(ele);
// }

let result1=arr1.forEach((ele,idx) => {
    console.log(ele,idx);
});

let result2=arr1.map(function(a,b){
    console.log(a,b);
    return b+a;
});

// console.log(typeof result1, typeof result2);
console.log(result2);
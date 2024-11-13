const arr1=['item1','item2','item3','item4'];
// const arr2=arr1;
// const arr2=[];
// for(let i=0; i<arr1.length; i++){
//     arr2.push(arr1[i]);
// }
const arr2=['item0',...arr1,'item5'];
console.log(arr1==arr2,arr2);
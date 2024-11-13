console.time('시간1');
console.log('log 출력');
console.error('err 출력');
console.warn('주의 출력');
console.log('-----------------------------------');
console.log(__dirname);
console.log(__filename);
console.log('-----------------------------------');
// console.log(process.env.url,process.env.id,process.env.pw);
console.log(process.env.JAVA_HOME);
console.log(process.env.pw?process.env.pw:'1234');
console.log('-----------------------------------');
setTimeout(() => {
    console.log('병렬실행1');
}, 3000);
setTimeout(() => {
    console.log('병렬실행2');
}, 2000);
console.log('병렬실행3');
console.timeEnd('시간1');
console.dir({key1:'va1',key2:'val2',key3:{k1:'key4',k2:'key5'}},{colors:false});

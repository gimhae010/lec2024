const path=require('path');

console.log(path.sep,path.delimiter);

const msg='c:\\workspace\\..\\.\\workspace\\node01\\ex01.js';
const msg1='c:\\workspace\\node01\\';
const msg2='.\\ex02.js';
console.log(msg1+msg2);
console.log(path.resolve(msg1+msg2));
const p1=path.parse(msg);
console.log(p1.dir);
console.log(p1.base);
console.log(p1.name,p1.ext);
console.log(path.isAbsolute(msg2));
console.log(path.relative('c:\\',msg2));
console.log(path.join('c:\\',msg2));
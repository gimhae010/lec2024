const query=require('querystring');

let msg='https://www.google.com/search?q=java&id=tester&pw=1234';
msg = msg.split('?')[1];
// console.log(msg);
console.log(query.parse(msg));
console.log(query.stringify(query.parse(msg)));
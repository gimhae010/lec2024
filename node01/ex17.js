const crypto=require('crypto');

const hash=crypto.createHash('MD5');
hash.update('abcd');

console.log(hash.digest('hex'));
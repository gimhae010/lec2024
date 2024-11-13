const even=require('events');

const emit=new even.EventEmitter();

const cb1=function(e){
    console.log('1이벤트');
};
const cb2=function(e){
    console.log('2이벤트');
};
emit.addListener('evn1',cb1);
emit.addListener('evn2',cb2);

emit.emit('evn1');
emit.emit('evn2');
console.log(emit.listenerCount('evn2'));

emit.removeListener('evn1',cb1)
emit.emit('evn1');
emit.emit('evn2');
console.log(emit.listenerCount('evn2'));

emit.removeListener('evn2',cb2)
emit.emit('evn1');
emit.emit('evn2');
console.log(emit.listenerCount('evn2'));
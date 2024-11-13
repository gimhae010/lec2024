const even=require('events');

const emit=new even.EventEmitter();

const cb1=function(e){
    console.log('1이벤트');
};
const cb2=function(e){
    console.log('2이벤트');
};
emit.on('evn1',cb1);
emit.on('evn2',cb2);

emit.emit('evn1');
emit.emit('evn2');

emit.off('evn1',cb1)
emit.emit('evn1');
emit.emit('evn2');

emit.off('evn2',cb2)
emit.emit('evn1');
emit.emit('evn2');
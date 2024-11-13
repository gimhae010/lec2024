// commonsjs 방식
// const {name,age} = require('./person');
// const {func}=require('./person2');

// es module
import {name,age} from './person.js'
import func from './person2.js'

console.log(name,age);
func();
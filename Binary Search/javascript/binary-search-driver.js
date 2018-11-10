var binarySearch = require('./binary-search');
var fs = require('fs');

var file = fs.readFileSync('../random-numbers.txt').toString();
var numbers = file.split('\n').map(i => +i);

console.log(binarySearch(numbers, 4204, 0, numbers.length)); // 0
console.log(binarySearch(numbers, 2125353, 0, numbers.length)); // 201
console.log(binarySearch(numbers, 7638830, 0, numbers.length)); // 779
console.log(binarySearch(numbers, 9760609, 0, numbers.length)); // 1000
console.log(binarySearch(numbers, 9760608, 0, numbers.length)); // -1
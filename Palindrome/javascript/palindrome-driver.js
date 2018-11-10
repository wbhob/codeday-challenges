var palindrome = require('./palindrome');
var fs = require('fs');
var path = require('path');

var file = fs.readFileSync(path.resolve(__dirname, '../words.txt')).toString();
var words = file.split('\n');

palindrome(words);
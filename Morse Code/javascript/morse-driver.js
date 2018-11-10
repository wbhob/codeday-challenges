var morse = require('./morse');

console.log(morse.encode("hello")); // .... . .-.. .-.. --- 
console.log(morse.encode("candy")); // -.-. .- -. -.. -.-- 
console.log(morse.encode("what is your name")); // .-- .... .- -   .. ...   -.-- --- ..- .-.   -. .- -- . 

console.log(morse.decode(".... ..   - .... . .-. . ")); // hi there
console.log(morse.decode(".-- .   .-.. .. -.- .   -.-. --- -.. . -.. .- -.-- ")); // we like codeday
console.log(morse.decode("- .... .- -. -.- ...   ..-. --- .-.   .--. .-.. .- -.-- .. -. --. ")); // thanks for playing


// Checks, should all be true
console.log(morse.encode("hello").equals(".... . .-.. .-.. --- "));
console.log(morse.encode("candy").equals("-.-. .- -. -.. -.-- "));
console.log(morse.encode("what is your name").equals(".-- .... .- -   .. ...   -.-- --- ..- .-.   -. .- -- . "));

console.log(morse.decode(".... ..   - .... . .-. . ").equals("hi there"));
console.log(morse.decode(".-- .   .-.. .. -.- .   -.-. --- -.. . -.. .- -.-- ").equals("we like codeday"));
console.log(morse.decode("- .... .- -. -.- ...   ..-. --- .-.   .--. .-.. .- -.-- .. -. --. ").equals("thanks for playing"));

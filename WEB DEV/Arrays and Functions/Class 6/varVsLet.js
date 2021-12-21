// // reassign.
// // function scope redeclare X
// // you canaccess a var variable before initialization/declaration
// var a;

// a = 10;

// var a;

// console.log(a);


console.log(a); //  < - gives error
// 1. let and const variable cannot be accessed before declaration
// because before declaration the ariable is in a temporal deadzone

// 2. block scope -> {}

// 3. cannot redeclare it
let a = 10;
//Functions
//functions are like machines, making our work easier
//functions expect arguments

// function add(a,b){
//     //console.log(a+b)
//     return a+b
// }//function Declaration

// //console.log(add(5,4))   //function invokation or function call

// function sayHi(){
//     console.log("Hii!")
// }

// sayHi()

//In java script functions are known as first class citizens
//Because functions can be declared in variables

//This is also known as function expression
// let sayHi = function(){
//     console.log("Hi")
// }//anonymous functionsfunctions with no name

// sayHi()

//IIFE (Immediately invoked function expression)
//normal functions are called after declaration
//IIFE allows to be called where the function is declared
//iife is also anonymous function
let add = (function(a,b){
    console.log(a+b)
    return a+b
})(10,20)

console.log(add)
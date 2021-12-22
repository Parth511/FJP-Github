
// // function are a variable
// function outer(param){
//     console.log(param);
//     param();

// }

// function chotaFn() {
//     console.log("Hello, chotu here.");
// }


// // 1. function can be passed as a parameter to another function
// outer(chotaFn);

// // 2. function's reference can be stored in another variable

// let a = [1, 2, 3, 4, 5];

// let b = a;

// // function expression
// let anotherName = function(){
//     console.log("I am an expression");
// }
// anotherName();



// 3. we can return a funciton from a function
// function fn(){
//     return "Hello";
// }

// let rval = fn();

// console.log(rval);


function outer(){
    console.log("Hello, outer here, returning inner");
    return function inner(){
        console.log("I am inner");
    }
}

let rVal = outer();
console.log(rVal);
rVal();
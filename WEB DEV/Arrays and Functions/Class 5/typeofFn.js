

// function fn(param){
//     console.log("This is a function definition", param);
// }

// fn("Hello");

// fn(true);

// fn({name: "Parth"});

// fn([10, 20, 30]);

// // functions are also variables in js

// function chotaFn(){
//     console.log("Hello i am a chota function.");
// }

// // variable assignment
// let secondName = function originalName(){
//     console.log("I am expression.");
// }

// secondName();


// Anonymous Function
console.log("Before");
// Immediately invoked function expression -> IIFEE
(function drawBoard(){
    console.log("Board is immediately draw upon.")
})();

console.log("After");

let secondName = function(){
    console.log("This is also an Anonymous function");
}

secondName();
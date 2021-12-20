
// 1. case without return

// // function definition
// function sayHello(name){
//     console.log("Hello ", name);
// }

// // functon invokation 
// sayHello("Parth");  // <- this line actualyl runs the above code

// // the function name is a variable that stores the reference to the function definition
// console.log(sayHello);

// console.log("8", sayHello);

// // when nothing is returned, undefined is returned
// console.log(sayHello("Parth"));

// 2. case with return

function sayHello(name){
    console.log(name, " said hello.");
    return name+" returns some stuff";
}

let rVal = sayHello("Parth");

console.log(rVal);
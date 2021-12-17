
//Functin definition
function sayHi(name){
    console.log(name, " Says Hi.");
    return [10, 20];
}//function only runs when it is called

// Function Invocation
let returnValue = sayHi("Parth Patel");
//Function will not work unlessit is called

console.log("Returned Value: ", returnValue);


let array = [10, 20, 30, 40];
let obj = { firstname: "Parth"};

// function is also a variable in JS
function chotaFunction(){
    console.log("This is chhotta function.");
}


// number
sayHi(10);

//string
sayHi("Hello");
// reference
// array
sayHi(array) // All 3 will print because values is passed by address in 


sayHi(chotaFunction);   // <- function address/reference is passed


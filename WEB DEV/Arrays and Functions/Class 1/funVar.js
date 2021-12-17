function sayHi(name){
    console.log("My name is: ", name);
    console.log("Before name()");
    name();
    console.log("After name()");

}

function chotaFunction(){
    console.log("I am chota function.");
}

sayHi(chotaFunction)

console.log(sayHi);
console.log(chotaFunction);


// but if we pass funciton definition
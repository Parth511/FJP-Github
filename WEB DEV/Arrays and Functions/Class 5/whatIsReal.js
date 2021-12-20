// hoisting, Memory Allocation of functions

// in  JS first memory is allocated completely and then code/script runs


console.log("script started.");
iamReal()
function iamReal(){
    console("I am the real kapoor and sons.");
}

function iamReal(){
    console.log("He is not the real kapoor and sons, I am the real kapoor and sons");
}

iamReal();

var fun = function(){
    gun();          //gun is not yet declared
}

fun();      // gun funciton is not defined here

var gun = function(){
    console.log("I am inside gun");
}

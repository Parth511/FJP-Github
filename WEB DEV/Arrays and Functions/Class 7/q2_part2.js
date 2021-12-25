function fun(){
    gun();
}

fun();

var gun = function(){
    consolelog("Inside gun");
}

// because the function int variable gun is not hoisted upto line 5, so upto that line the variable gun is not a function name
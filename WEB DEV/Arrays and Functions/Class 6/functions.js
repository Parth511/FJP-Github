function fn(param1, param2){
    console.log("Inside fn", param1, param2);
}

fn("Hello", "Hi");

// if there us something  -> default -> undefined

fn("Hello");

fn();

fn("Hello", "Hi", "Byee");


function fn2(){
    console.log(arguments);
}

fn2("a", "b", [1,2,3,4]);


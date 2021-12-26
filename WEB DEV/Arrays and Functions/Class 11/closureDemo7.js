function powerFunctionCreator(obj){
    console.log('typeof exp');
    if(typeof obj.exp !== 'number'){
        console.log("exp must be a number.");
    }

    // inner function makes a closure on the variables from the outer functions, to be used into it.
    let powerFn = function(base){
        let rv = Math.pow(base, obj.exp);
        return rv;
    }
    return powerFn;
}

let obj = {
    exp:2
}

let squarer = powerFunctionCreator(obj);
let sqo8 = squarer(8);
console.log(sqo8);

obj.exp = 3;
let cuo8 = squarer(8);
console.log(cuo8);
function powerFunctionCreator(exp){
    console.log('typeof exp');
    if(typeof exp !== 'number'){
        console.log("exp must be a number.");
    }

    // inner function makes a closure on the variables from the outer functions, to be used into it.
    let powerFn = function(base){
        let rv = Math.pow(base, exp);
        return rv;
    }
    return powerFn;
}

let squarer = powerFunctionCreator(2);
let sqo8 = squarer(8);
console.log(sqo8);
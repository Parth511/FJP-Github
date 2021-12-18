// this -> is a predefined keyword in js
// that references to the entity that is calling a method

Array.prototype.MyMap = function (fun){
    let newElem = [];
    for(let i=0; i<this.length; i++){
        newElem.push(fun(this[i]));
    }
    return newElem;
}

Array.prototype.MyFilter = function (test){
    let newElem = [];
    for(let i=0; i<this.length; i++){
        if(test(this[i]))
            newElem.push(this[i]);
    }
    return newElem;
}

let arr = [1, 2, 3, 4, 5, 6];

function squarer(x){
    return x*x;
}

function checkOdd(x){
    return x%2 == 1
}

console.log(arr.MyMap(squarer));

console.log(arr.MyFilter(checkOdd));
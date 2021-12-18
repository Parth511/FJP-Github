
Array.prototype.MyForEach = function (cb){
    for(let i=0; i<this.length; i++)
        cb(this[i]);
}

Array.prototype.MyEvery = function (cb){
    for(let i=0; i<this.length; i++){
        if(cb(this[i]) == false)
            return false;
    }
    return true;
}

const array1 = ['a','b','c'];
function printElem(element){
    console.log(element);
}

array1.myForEach(printElem);

function isBelowThreshold(element){
    return element < 40;
}

let array2 = [1, 30, 39, 29, 10, 13, 40];
console.log(array2.MyEvery(isBelowThreshold));

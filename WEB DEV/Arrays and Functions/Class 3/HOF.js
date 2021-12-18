const array1 = ['a', 'b', 'c'];
function printElem(element){
    console.group(element);
}
array1.forEach(printElem);


let array2 = [1, 30, 39, 29, 10, 13, 40];
function isBelowThreshold(currValue){
    return currValue < 40;
}
console.log(array2.every(isBelowThreshold));

const array = [1, 2, 3, 4, 5];
function even(element){
    return element % 2 == 0;
}
console.log(array.some(even));

const array3 = [5, 12, 8, 130, 44];

function isLargerNumber(element){
    return element > 13;
}
console.log(array1.findIndex(isLargerNumber));
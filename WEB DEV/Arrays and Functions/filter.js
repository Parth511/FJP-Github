let array = [1, 3, 5, 6, 7, 8]

function oddTest(number){
    return number%2==1;
}

function evenTest(number){
    return number%2==0;
}

// pass -> allows in new array
// fail -> not allowed in new array
let newArray = array.filter(oddTest);
let evenArray = array.filter(evenTest);

console.log(evenArray);
console.log(newArray);
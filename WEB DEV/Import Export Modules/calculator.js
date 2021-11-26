function add(a, b){
    console.log('Sum: ', a+b)
}

function subtract(a, b){
    console.log('Difference is: ', a-b)
}

function multiply(a, b){
    console.log('Product is: ', a*b)
}

function divide(a, b){
    console.log('Division gives: ', a/b)
}

module.exports ={
    addition: add,
    subtract: subtract,
    multiply, multiply,
    division: divide
}
//module.export is an Object provided by node js by which we can export our functions in key value pair
//We will use ur functions with the keys 
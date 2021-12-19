let arr = [20, 2, 3, 4, 5];

// Reduce is a higher order function that takes storage as a parameter
//
// storage = 1
// storage = storage * element for each element

function sum(storage, elem){
    console.log("storage: ", storage, " elem: ", elem );
    return storage + elem;
}

function product(storage, elem){
    console.log("storage: ", storage, " elem: ", elem );
    return storage*elem;
}

// 1. case -> without providing initial value
// examples
// let finalProd = arr.reduce(product);
// console.log(finalProd);
// let finalSum = arr.reduce(sum);
// console.log(finalSum);

// 2. case
//     PROVIDING INITIAL VALUE
//  Storage initial value = provided value
let finalProduct = arr.reduce(product, 10);
console.log(finalProduct);


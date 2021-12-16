// functions are available on arrays

let array = [1, 2, 3, 4, 5];

function squarer(x){
    return x*x;
}

// let ans = squarer(array[0]);
// console.log(ans);
// ans = squarer(array[2]);
// console.log(ans);
// ans = squarer(array[1]);
// console.log(ans);


//map function 
// It does not change the original array

let squaredArray = array.map(squarer);

console.log(squaredArray);

function cubex(x){
    return x*x*x;
}

let cubedArray = array.map(cubex);

console.log(cubedArray);
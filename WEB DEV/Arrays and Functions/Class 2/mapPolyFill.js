let arr = [1, 2, 3, 4, 5, 6];

function squarer(x){
    return x*x;
}

console.log(arr.map(squarer));

function myMap(arr, fun){
    let newArr = [];
    for(let i=0; i<arr.length; i++){
        newArr.push(fun(arr[i]))
    }
    return newArr;
}

console.log(myMap(arr, squarer));
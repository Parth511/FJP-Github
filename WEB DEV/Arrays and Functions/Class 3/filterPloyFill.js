// hof on arrays

// it takes a funciton -> test function -> 
// filter function calls the given function on every element of that given array
// if that function returns true, then we will add that element to the new array
// and return the new filtered array

// if function returns false then skip that element and don't add into the new array


let arr = [2, 3, 5, 6, 7, 8];

function checkOdd(num){
    return num%2==1;
}

console.log(arr.filter(checkOdd));

// To implement filter

function myFilter(arr, test){
    let newArr = [];
    for(let i=0; i<arr.length; i++){
        if(test(arr[i])){
            newArr.push(arr[i]);
        }
    }
    return newArr;
}

console.log(myFilter(arr, checkOdd));

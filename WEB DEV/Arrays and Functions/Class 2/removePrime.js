let arr = [5, 7, 19, 12, 13, 14];

//can't use extra space 
// remove prime numbers from the given array

let len = arr.length;
for(var i=0; i<arr.length; i++){
    if(isPrime(arr[i])){
        arr.splice(i, 1);
        i--;
    }
}

console.log(arr);

function isPrime(n){
    for(let i=2; i*i < n; i++){
        if(n%i==0)
            return false;
    }
    return true;
}


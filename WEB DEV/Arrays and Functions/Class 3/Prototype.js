Array.prototype.sayHello = function (elem) {
    console.log("Hello " + elem);
}

Array.prototype.sum = function (elem) {
    console.log("this is: " + this);
    let sum = 0;
    for(let i=0; i<this.length; i++){
        sum = sum + this[i];
    }
    console.log(sum);
    return sum;
}

Array.prototype.product = function() {
    let pro = 1;
    for(let i=0; i<this.length; i++){
        pro = pro * this[i];
    }
    console.log(pro);
    return pro;
}

let arr1 = [1, 2];
let arr2 = [3, 4];

// arr1.sayHello("arr1");
// arr2.sayHello();


arr1.sum();
arr2.product();
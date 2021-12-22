// function outer(first) {
//     console.log("Inside outer.");
//     return function inner(second){
//         console.log("Inside inner.");
//         return first*second;
//     }
// }

// let rVal = outer(2);
// console.log("Before calling rVal that contains inner");
// let ans = rVal(4);
// console.log(ans);


// practical example

function enterFirstName(first){
    return function enterLastName(lastName){
        return function enterAge(age){
            console.log("Name: " + first + lastName + " and Age: " + age);
        }
    }
}

console.log("Kindly enter your firstname");
let rVal1 = enterFirstName("Parth");
console.log("Kindly enter your lastname");
let rVal2 = rVal1("Patel");
console.log("Kindly enter your age");
rVal2("21");
console.log("Doing random stuff");

// The outer function variables are still present in memory after the outer function is called 
// and this value can be used in further inner funcitons.
// //variable declaration with let var ad const keywords

// var a; // first the variable is initialized with undefined
// console.log(a)
// a = 20
// console.log(a);

// //Javascript is s synchronous language, line-by-line
// //and a single threaded language

// //JavaScript is a dynamic language, variables do not need datatypes
// a = null
// a = "String value"  //Dynamic behavior of javascript
// a = true
// console.log(a)


// //var allows redeclaration
// // var b = 2
// // console.log(b)
// // var b = 'String'
// // console.log(b)


// //let and const keywords
// // let b = 2
// // console.log(b)
// // let b = 'String'
// // console.log(b)

// //Let keyword does not allow redeclaration.


// //loops and if else
// // Use isPrime to check prime number

// let flag = true;
// var num = 13;

// for(let i = 2; i*i<=num; i++){
//     if(num%i==0){
//         flag = false;
//         break;
//     }

// }

// if(flag)
//     console.log(num + " is prime")
// else
//     console.log(num+" is not prime");

// if(10%2==0){
//     var c = 2
//     console.log(c)
// }
// console.log(c)

//const does not allow redefining
// const x = 2;

// x = 3
// console.log(x)

// let str = 'parth'
// console.log(str)

//string Methods-

//1 string length=> /length
// console.log(str.length)

// //extracting parth of string -slice and substr

// str  = str + "Patel"

// console.log(str)

// let slicedStr = str.slice(3,7)

// console.log(slicedStr)  //last index is excluded in sliced
// //sliced expects 2 parameters start and end index  of the slice of string

// //substr method 
// //substr expects two parameters that is starting index and length of output substring
// let subString = str.substr(3,7)
// console.log(subString)


//replace method
//replaces a word or string 
//expects word to be replaced as first aargument and the replacement word as second argument
// let sayHello = 'Hello Mukesh'
// console.log(sayHello)   //Hello mukesh

// let sayBye = sayHello.replace('Hello','Bye')
// console.log(sayBye)     //bye mukesh

//toUppercase and toLowercase

// let text1 = 'Hello World'
// let text2 = text1.toUpperCase()
// console.log(text2)
// text2 = text1.toLocaleLowerCase()
// console.log(text2)


//concatenation method
//joins 2 strings

// let first = "hello"
// let second = "world"

// let third = first.concat(' ', second);
// console.log(third)

//Trim method

let text  = '     hello   '
let trimmedText = text.trim()
console.log(trimmedText)
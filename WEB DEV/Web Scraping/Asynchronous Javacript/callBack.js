const fs = require('fs')

// function printFirstName(firstName, cb) {
//     console.log(firstName)
//     cb("Patel")
// }


// function printLastName(lastName) {
//     console.log(lastName)
// }

// printFirstName("Parth", printLastName)

// Any function that is passed as an argument to another function
// Any funciton that is called after a function has finished executing


// Synchronous way of reading file
// console.log("before")
// let data = fs.readFileSync("C:\\Users\\Parth\\Desktop\\FJP2\\FJP2 Notes and Codes\\WEB DEV\\Web Scraping\\Asynchronous Javacript\\f1.txt")
// console.log("" + data)

// console.log("after")


//Asynchronous way -> here the code does not wait for the file to be read
// console.log("before")
// fs.readFile("C:\\Users\\Parth\\Desktop\\FJP2\\FJP2 Notes and Codes\\WEB DEV\\Web Scraping\\Asynchronous Javacript\\f1.txt", cb)
// function cb(err, data){
//     if(err){
//         console.log("Error!")
//     }
//     console.log(""+data) // <-by default data is stored in data
// }
// console.log("After")
// Asynchronous means the main thread does not stop in between.

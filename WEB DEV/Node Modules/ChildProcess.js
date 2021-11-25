const cp = require ('child_process')


// console.log('Trying to open calculator')
// cp.execSync('calc')         // opens calculator

// console.log('Calculator opened')


// console.log('Trying to open VS code')
// cp.execSync('code')             //opens vs code

// console.log('VS code opened')


// cp.execSync('start chrome') //  Opens Chrome browser


// cp.execSync('start chrome https:://www.pepcoding.com')  //directs to pepcoding website


let output = cp.execSync('node test.js')
console.log('Output is ' + output) //can concatenate with empty string as well
//Concatenation converts buffered value into string value

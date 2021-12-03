//1. First Activity with Node.js

//We will be creating a File System.Organizer
//features of this Project:
// If you have numerous files in a folder and they are not properly arranged
// So you can use this tool to arrange them in specific directory according to their extension
// like text files will go into the testfolder and exe files go into the executable folder and so onabort.
// So at the ans we will have han arranged set of fiels in specific folders

//we will be using built in node modules like fs and path to create this object

//NodeJS treats command line input as an array, and that arrya is your process array
// let input = process.argv[2]
// console.log(input)
//node .\FileOrganiser.js InputAt2     <- Process array in CLI
//InputAt2                             <- Output is from second index of process array in CLI

// let inputArr = process.argv.slice(2)
// console.log(inputArr)
// node .\FileOrganiser.js organise     <- Process array in CLI
// [ 'organise' ]                       <- Array sliced from index 2 of Process array

// node .\FileOrganiser.js organise Input2 Input 3  <- Process array in CLI
// [ 'organise', 'Input2', 'Input', '3' ]           <- Array sliced from index 2 of Process array

// let inputArr = process.argv.slice(2, 4)
// console.log(inputArr)
// node .\FileOrganiser.js organise Input2 Input 3  <-Process array in CLI
// [ 'organise', 'Input2' ]                         <- Array sliced frmo 2 index to 4 index

const fs = require('fs')
const path = require('path')
const helpObj = require('./Commands/help')
const treeObj = require('./Commands/tree')
const organizeObj = require('./Commands/organize')


let inputArr = process.argv.slice(2);
// console.log(inputArr)

let command = inputArr[0];   //<- first 2 are sliced, so command is at 0 index at process array and path if applicable should be at 1 index of process array

//Check for what operation the user has asked for in the process array
switch (command) {
    case 'tree':
        treeObj.treeFnKey(inputArr[1])
        break;
    case 'organize':
        organizeObj.organizeFnKey(inputArr[1])
        break;
    case 'help':
        helpObj.helpFnKey()
        break;
    default:
        console.log('Please enter a VALID command')
        break;
}

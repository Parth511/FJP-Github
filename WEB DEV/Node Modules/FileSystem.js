//Node modules are used to perform different tasks as required

//File System Modules-
const fs = require('fs')

// //Reading
// let content = fs.readFileSync('f1.txt')
// console.log('Data in F1 file is: ')
// console.log(content + '')
// console.log('File f1.txt read.')
// //readfileSync is a method to read a file

// //Writing
// fs.writeFileSync('f1.txt', 'Hello from F2')
// console.log('File f1.txt written into.')
// //writeFileFync method is used to put data 
// //or write to a file. 
// //If the file does not exist, new will be created
// //if exists the data in it initially will be erased 
// //and new data will be entered

// //Updating, Append a file
// fs.appendFileSync('f2.txt', 'Updating this file using append')
// console.log('File f2.tst appended.')
// //Updates preexisting file and appends the data
// //onto preexisting data.
// //If the file does not exist then this will create a new file and add the data to it similar to writeFileSync methos

// //delete a file by parsing it's path
// //unlinkSync
// fs.unlinkSync('f2.txt')
// console.log('File f2.txt deleted.')


// Directories
//Making anew directory
// fs.mkdirSync('myDirectory')
//used to make a new directory

//delete directory
// fs.rmdirSync('myDirectory')
//used to remove or delete a directory

//path

// //check wweather a directory exists or not
// //we can use existsSync method
// let doesExist = fs.existsSync('myDirectory')
// console.log(doesExist)
// //passes true if directory exists,or false otherwise


// //stats of a path(folder details, contents)
// let statsOfPath = fs.lstatSync('myDirectory')
// console.log(statsOfPath)
// //lstatSync provides all the statistics of a folder or directory

// console.log('isFile?', statsOfPath.isFile())
// //returns weather or not the passed stat is of a file

// console.log('isDirectory?', statsOfPath.isDirectory())
// //returns weather ornot the passed stats if of a directory


let folderPath = 'C:\\Users\\Parth\\Desktop\\FJP2\\WEB DEV\\Node Modules\\myDirectory'
let folderContent = fs.readdirSync(folderPath)
console.log('Contents in myDirectory ' + folderContent)
//readDirSync is used to check content details of a folder/directory


//copy files

//source folder from where data is to be copied
let srcFile = 'C:\\Users\\Parth\\Desktop\\FJP2\\WEB DEV\\Node Modules\\myDirectory\\f3.txt'
//destination folder where the files are to be pasted
let destFolder = 'C:\\Users\\Parth\\Desktop\\FJP2\\WEB DEV\\Node Modules\\MyDir2\\'

const path = require('path')

let toBeCopiedFileName = path.basename(srcFile)
console.log(toBeCopiedFileName)
//base name method gets the actual name of the file or directory

let destPath = path.join(destFolder, toBeCopiedFileName)
console.log(destPath)
//joins the 2 paths given as arguments

fs.copyFileSync(srcFile, destPath)
console.log('File copied')
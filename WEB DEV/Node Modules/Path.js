const path = require('path')

//if we pass a path of a file, then we can get the file's path by
let ext = path.extname('C:\\Users\\Parth\\Desktop\\FJP2 Notes and Codes\\WEB DEV\\Node Modules\\f1.txt')
console.log('extension of file-> ', ext)


//To get base name/actual name of file or directory
let baseName = path.basename('C:\\Users\\Parth\\Desktop\\FJP2 Notes and Codes\\WEB DEV\\Node Modules\\f1.txt')
console.log('Base name of file-> ', baseName)

//To get path of current working directory
console.log(__dirname)

//To get path of current working file
console.log(__filename)
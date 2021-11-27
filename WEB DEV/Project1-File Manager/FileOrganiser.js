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

let inputArr = process.argv.slice(2);
// console.log(inputArr)

let command = inputArr[0];   //<- first 2 are sliced, so command is at 0 array

let types = {
    media: ["mp4", "mkv","mp3"],
    archives: ['zip', '7z', 'rar', 'tar', 'gz', 'ar', 'iso', "xz"],
    documents: ['docx', 'doc', 'pdf', 'xlsx', 'xls', 'odt', 'ods', 'odp', 'odg', 'odf', 'txt', 'ps', 'tex'],
    app: ['exe', 'dmg', 'msi', 'pkg', "deb"],
    images: ['jpg','png']
}


switch(command){
    case 'tree':
        treeFn()
        break;
    case 'organize':
        organizeFn(inputArr[1])
        break;
    case 'help':
        helpFn()
        break;
    default:
        console.log('Please enter a VALID command')
        break;
}


function treeFn(){
    console.log('Tree Function Implemented')
}

function organizeFn(dirPath){
    // 1. Input of a directory path

    if(dirPath == undefined){
        console.log('Please enter a Directory Path')
        return;
    }
    else{
        let doesExist = fs.existsSync(dirPath);
        // 1. Check if path does exist
        // console.log(doesExist)
        if(doesExist){
            // 2. Create an Organized files directory
            destPath = path.join(dirPath, 'organized_files')
            // C:\test_folder <-Original Path
            // C:\test_folder\organized_files <-New Path
            if(fs.existsSync(destPath) == false){
                fs.mkdirSync(destPath)  //creates a new folder if one does not already exist
            }
            else{
                console.log('The folder already exists')
            }
            organizeHelper(dirPath, destPath);
        }
        else{
            console.log('Path does not exist')
        }
    }
}

function organizeHelper(src, dest){

    let childNames = fs.readdirSync(src)
    // console.log(childNames)

    for(let i=0; i<childNames.length; i++){
        let childAddress = path.join(src, childNames[i])
        let isFile = fs.lstatSync(childAddress).isFile();

        if(isFile){     //Arrange only entities that are files(isFile = true)
            let fileCategory = getCategory(childNames[i])
            console.log(childNames[i] + ' belongs to: ' + fileCategory)
        }
    }

}

function getCategory(Name){
    let ext = path.extname(Name)

    ext = ext.slice(1)  //Removes dot from first position by slicind and storing the remaining
    // console.log(Name, ': ', ext)

    for(let type in types){
        let cTypeArr = types[type]      //Key value pairs gives values for corresponding keys

        for(let i = 0; i<cTypeArr.length; i++){
            if(ext == cTypeArr[i])
                return type;
        }
    }
}

function helpFn(){
    console.log(`List of all the commands -
                 1) Tree commmand - node FO.js tree <dirName>
                 2) Organise command - node FO.js organise <dirName>
                 3) Help command - node FO.js help
                  Here <dirName> is the name of the directory
                  you want to run this script on.`)
}
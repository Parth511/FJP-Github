const fs = require('fs')
const path = require('path')


//Types is an object, containing key-value pairs for each category of files
let types = {
    media: ["mp4", "mkv", "mp3"],
    archives: ['zip', '7z', 'rar', 'tar', 'gz', 'ar', 'iso', "xz"],
    documents: ['docx', 'doc', 'pdf', 'xlsx', 'xls', 'odt', 'ods', 'odp', 'odg', 'odf', 'txt', 'ps', 'tex'],
    app: ['exe', 'dmg', 'msi', 'pkg', "deb"],
    images: ['jpg', 'png']
}

function organizeFn(dirPath) {
    // 1. Input of a directory path

    if (dirPath == undefined) {   //check weather or not destination path was entered
        console.log('Please enter a Directory Path')
        return;
    } else {
        let doesExist = fs.existsSync(dirPath);
        // 1. Check if path does exist
        // console.log(doesExist)
        if (doesExist) {                                  // if path exists, then just join it for destination path
            // 2. Create an Organized files directory
            destPath = path.join(dirPath, 'organized_files')
            // C:\test_folder <-Original Path
            // C:\test_folder\organized_files <-New Path
            if (fs.existsSync(destPath) == false) {       // if path does not exist then create a directory.
                fs.mkdirSync(destPath)
            }
            else {
                console.log('The folder already exists')
            }
            organizeHelper(dirPath, destPath);          //Call organize helper function o arrange files in organized_files
        }
        else {
            console.log('Path does not exist')
        }
    }
}

//To categorize all files according to their extensions
function organizeHelper(src, dest) {

    let childNames = fs.readdirSync(src)                //read source folder and store allentities in childNames data type
    // console.log(childNames)

    for (let i = 0; i < childNames.length; i++) {                         //Iterate the childNames one by one
        let childAddress = path.join(src, childNames[i])            //Join paths for address of each child entity
        let isFile = fs.lstatSync(childAddress).isFile();           //Check if the entity being read is a file or not

        if (isFile) {                                                 //Arrange only entities that are files(isFile = true)
            let fileCategory = getCategory(childNames[i])                   //If the child entity is a file then get it's category from getCategory function
            console.log(childNames[i] + ' belongs to: ' + fileCategory)

            sendFiles(childAddress, dest, fileCategory)             //Send the files from the source (unorganised folder) to the destination folder
        }
    }

}


function getCategory(Name) {
    let ext = path.extname(Name)        //Store the extension of the file in a variable

    ext = ext.slice(1)                  //Removes dot from first position by slicind and storing the remaining
    // console.log(Name, ': ', ext)

    for (let type in types) {
        let cTypeArr = types[type]          //Key value pairs gives values for corresponding keys

        for (let i = 0; i < cTypeArr.length; i++) {
            if (ext == cTypeArr[i])          //If type is found, return it
                return type;
        }
    }

    return "others"                         //If type is not found then return others as the file type
}

//Sends file from source file to it's category folder in destination folder
function sendFiles(srcFilePath, dest, fileCategory) {
    let catPath = path.join(dest, fileCategory)     //Creates category path by joining destination to the category folder

    if (fs.existsSync(catPath) == false) {              //If caegory path does not exist then create that category folder
        fs.mkdirSync(catPath)
    }
    let fileName = path.basename(srcFilePath)
    let destFilePath = path.join(catPath, fileName) //Make destination path for the file by joining category path with filename
    fs.copyFileSync(srcFilePath, destFilePath)      //Copy the file from source path to the category path

    console.log(fileName + " copied to " + fileCategory)
    fs.unlinkSync(srcFilePath)                      //Delete the original file because it is now organized into it's folder
}

module.exports={
    organizeFnKey: organizeFn
}


function helpFn() {
    console.log(`List of all the commands -
                 1) Tree commmand - node FO.js tree <dirName>
                 2) Organise command - node FO.js organise <dirName>
                 3) Help command - node FO.js help
                  Here <dirName> is the name of the directory
                  you want to run this script on.`)
}

module.exports = {
    helpFnKey : helpFn
}
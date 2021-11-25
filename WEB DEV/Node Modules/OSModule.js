const os = require('os')        //used to get details about the OS
//architecture (32 or 64 bit)
console.log(os.arch())
//platform 
console.log(os.platform())
//network details
console.log(os.networkInterfaces())
//cpu use
console.log(os.cpus())


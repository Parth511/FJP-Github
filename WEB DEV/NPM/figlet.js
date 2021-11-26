
//To install a Package -
//go to folder you want to isntall the package in a the Terminal
//and type -> npm install <packageName>
//

var figlet = require ('figlet');

figlet('hello world!', function(err, data){
    if(err){
        console.log('Something went wrong...');
        console.dir(err);
        return;
    }
    console.log(data);
});
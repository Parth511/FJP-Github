var inquirer = require('inquirer');
const cp = require('child_process')

function displayDetails(){

inquirer
  .prompt([
    /* Pass your questions in here */
    {
        type: 'list',
        name: 'Selection',
        choices: ['About', 'Skills', 'Projects', 'Academics'],
    }
  ])
  .then((choices) => {
    // Use user feedback for... whatever!!
    if(choices.Selection == 'About'){
        console.log(`Aspiring Software Developer and 
        Data Science Enthusiast!`)
        displayNext()
    }
    else if(choices.Selection == 'Skills'){
        console.log(`C, C++, Java, JavaScript, Node,
         DSA, Python Other Stuff`)
        displayNext()

    }
    else if(choices.Selection == 'Projects'){
        cp.execSync('start chrome https://github.com/Parth511/FJP-Github')
        displayNext()

    }
    else if(choices.Selection == 'Academics'){
        cp.execSync('start chrome https://www.linkedin.com/in/parth-g-patel/')
        displayNext()

    }
  })
  .catch((error) => {
    if (error.isTtyError) {
      // Prompt couldn't be rendered in the current environment
    } else {
      // Something else went wrong
    }
  });

}

displayDetails()

function displayNext(){
    var inquirer = require('inquirer');
inquirer
  .prompt([
    /* Pass your questions in here */

    {
        type: 'list',
        name: 'GoBack',
        choices: ['Back','EndProgram'],
    }
  ])
  .then((choice) => {
    // Use user feedback for... whatever!!
    if(choice.GoBack == 'Back'){
        displayDetails()
    }
    else if(choice.GoBack == 'EndProgram'){
        console.log('Thank You!')
    }

  })
  .catch((error) => {
    if (error.isTtyError) {
      // Prompt couldn't be rendered in the current environment
    } else {
      // Something else went wrong
    }
  });
}
const request = require('request')
const cheerio = require('cheerio')

console.log('before')
//request site data
request('https://www.worldometers.info/coronavirus/' , cb)

//Requess the link with concept of callback
function cb(error, response, html) {
    if(error){
        console.error(error)
    }else{
        // console.log(html)
        handleHtml(html)
    }
}

function handleHtml(html){
    // in selector tool we are getting the whole html of the page
    let selTool = cheerio.load(html)
    //in content Arr we are storing the content with id: #maincounter-wrap span
    let contentArr = selTool('.maincounter-number span')

    // for(let i=0; i<contentArr.length; i++){
    //     let data = selTool(contentArr[i]).text()
    //     console.log('data ' , data)
    // }
    // console.log("Content Array has: ", contentArr)
    let totalCases = selTool(contentArr[0]).text()
    let totalDeaths = selTool(contentArr[1]).text()
    let totalRecoveries = selTool(contentArr[2]).text()
    console.log("Total Cases: ", totalCases)
    console.log("Total Deaths: ", totalDeaths)
    console.log("Total Recoveries: ", totalRecoveries)
}
console.log('after')

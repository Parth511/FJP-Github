const request = require('request');
const cheerio = require('cheerio');
// install request and cheerio before running

url = "https://www.espncricinfo.com/series/ipl-2020-21-1210595/chennai-super-kings-vs-kings-xi-punjab-53rd-match-1216506/ball-by-ball-commentary"

request(url , cb);

function cb(error, response, html) {
    if(error){
        console.error(error)
    }else{
        // console.log(html)
        extractHtml(html)
    }
}

function extractHtml(html){
    let $ = cheerio.load(html)
    let elemArr = $('.d-flex.match-comment-padder.align-items-center .match-comment-long-text')

    let lbc = $(elemArr[0]).text();
    console.log(`Last Ball Commentary -> 
                    ${lbc}`)
}
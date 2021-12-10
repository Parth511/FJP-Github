const request = require('request');
const cheerio = require('cheerio');
// install request and cheerio before running

url = "https://www.espncricinfo.com/series/ipl-2020-21-1210595/chennai-super-kings-vs-kings-xi-punjab-53rd-match-1216506/full-scorecard"
request(url , cb);

function cb(error, response, html) {
    if(error){
        console.error(error)
    }else{
        // console.log(html)
        extractHtml(html)
    }
}

console.log('Before')
function extractHtml(html){
    // full html source code
    let $ = cheerio.load(html);

    let teamsArr = $('.match-info.match-info-MATCH.match-info-MATCH .team')

    // console.log($(teamsArr).text())

    let winningTeam;

    for(let i=0; i<teamsArr.length; i++){
        let hasClass = $(teamsArr[i]).hasClass("team-grey")
        if(!hasClass){
            let teamNameElem = $(teamsArr[i]).find(".name")
            winningTeam = teamNameElem.text().trim()
        }
    }

    // console.log(winningTeam)


    //Innings
    let inningsArr = $('.card.content-block.match-scorecard-table>.Collapsible')
    let htmlStr = ""

    for(let i=0; i<inningsArr.length; i++){
        let cHtml=$(inningsArr[i]).html()
        htmlStr+=cHtml

        let teamNameElem = $(inningsArr[i]).find('.header-title.label')
        let teamName = teamNameElem.text();
        teamName = teamName.split('INNINGS')[0].trim()
        // console.log(teamName)

        let hwtName = ''
        let hw = 0

        if(winningTeam == teamName){
            let tableElem = $(inningsArr[i]).find(".table.bowler")
            let allBowlers = $(tableElem).find('tr')

            for(let j=0; j<allBowlers.length; j++){
                let allColOfPlayers = $(allBowlers[j]).find('td')
                let playerName = $(allColOfPlayers[0]).text()
                let wickets = $(allColOfPlayers[4]).text()
                
                if(wickets >= hw){
                    hw = wickets
                    hwtName = playerName
                }

                
            }
            console.log('In the team: ', winningTeam)
            console.log(`Highest wicket taker is: ${hwtName} With: ${hw} wickets.`)
        }
        // console.log('In the team: ', winningTeam)
        // console.log(`Highest wicket taker is: ${hwtName} With: ${hw} wickets.`)
    }
    // console.log(htmlStr)

}

console.log('After')
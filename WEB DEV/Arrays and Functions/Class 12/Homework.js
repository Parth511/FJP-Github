Array.prototype.processStrings = function(sscb, lscb, criteria){
    let oarr = this;
    for(let i=0; i<oarr.length; i++){
        let str = oarr[i];
        if(str.length > criteria)
            lscb(str);
        else
            sscb(str);
    }
    return this;
}

let arr = [
    "My Name is Sumeet Malik. I am a teacher. I teach programming.",
    "India has gone to SA. India started well. But it rains.",
    "India won in Australia. England won't",
    "Lorem ipsum dolor, ipsum dolor lorem. dolor lorem"
];

arr.processStrings(handleShortString, handleLongString, 40);

function handleShortString(str){
    let res1 = str.split(".");
    let res2 = res1.filter(s => s.length > 0);
    let res3 = res2.map(s => s.trim());
    let res4 = res3.map(s => s.split(" "));
    let res5 = res4.map(a => a.reverse());
    let res6 = res5.map(a => a.join(" "));
    let res7 = res6.join(". ");
    let res8 = res7 + ".";
    console.log(res8);
}

function handleLongString(str){
    let res1 = str.split(".");
    let res2 = res1.filter(s => s.length > 0);
    let res3 = res2.map(s => s.trim());
    let res4 = res3.reverse();
    let res5 = res4.join(". ");
    let res6 = res5 + ".";
    console.log(res6);
}


// add a function to all arrays which takes as input two callbacks
// one for small strings (<50 in length) and the other for long strings

// short string callback shoule do the following:
// My Name is Sumeet Malik. I am a teacher. I teach programming
// Malik Sumeet is name My. teacher a am I. Programming teach I.

// long string callback should do the following
// My Name is Sumeet Malik. I am a teacher. I teach programming
// I teach programming. I am a teacher. My name is Sumeet Malik.


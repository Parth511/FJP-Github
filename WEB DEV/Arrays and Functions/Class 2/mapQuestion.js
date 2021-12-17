let members = [{
    g : "m",
    ages : 20,
    income : 200
},{
    g : "f",
    ages : 25,
    income : 100
},{
    g : "m",
    ages : 20,
    income : 70
},{
    g : "f",
    ages : 30,
    income : 50
}]
let elem = members
elem.income *= 2;
let variable = elem
console.log(varable);

// // income -> less than 100 -> double them using map


// function doubleIncome(member){
//     if(member.income < 100){
//         member.income *=2;
//     }
//     return member;
// }

// let newArr = members.map(doubleIncome);

// console.log(members.map(doubleIncome));
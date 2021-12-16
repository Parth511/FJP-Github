let array1 = [1, 4, 3, 6, 5];
let array2 = [1, 3, 100, 200];
finalArray = [1, 4, 3, 6, 5, 100, 200];

for(let i=0; i<array2.length; i++){
    let currEle = array2[i];
    //If element is present then includes will give true, else it will give false
    let isPresent = array1.includes(currEle);
    if(!isPresent){
        array1.push(array2[i]);
    }
}

console.log(array1);
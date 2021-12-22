// function outer(){
//     var arr = [];
//     for(var i = 0; i<3; i++){
//         arr.push(function(){
//             console.log(i);
//         })
//     }
//     return arr;
// }


// solution 1 -> execution context

function outer(){
    var arr = [];
    for(var i=0; i<3; i++){
        function outer(){
            var j = i;
            return function(){
                console.log(j);
            }
        }
        arr.push(outer());
    }
    return arr;
}

console.log("Before calling outer");
var arr =outer();
arr[0]();
arr[1]();
arr[2]();
console.log("After calling outer");
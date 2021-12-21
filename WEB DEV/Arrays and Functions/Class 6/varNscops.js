
function fn() {
    console.log("Before declaration 8", a);

    var a;

    console.log("After declaration 10", a);

    a = 20;

    if(true){
        var a = 30;

        console.log("35", a);
    }
    console.log("After initialization 12", a);
}

fn();

// console.log("Outside function: ", a);
// This gives error because var is a function scope
var a;

a = 20;

function fn() {
    console.log("Before declaration", a);

    var a;

    console.log("After declaration", a);

    a = 10;

    console.log("After initialization", a);
}

fn();

function fn() {
    console.log("Before declaration", a);

    var a;
    console.log("After declaration", a);
    
    a = 20;

    if(true){
        var a = 30;
        console.log("29", a);
    }
    console.log("After initialazation 12", a);
}

fn();

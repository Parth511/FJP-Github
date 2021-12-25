Function.prototype.myBind = function(){
    let orgFun = this;
    let argsArray = Array.from(arguments);
    let newThis = argsArray[0];
    let newParams = argsArray.slice(1);

    let myFun = function(){
        let moreParams = Array.from(arguments);
        let totalParams = newParams.concat(moreParams);

        orgFun.apply(newThis, totalParams);
    }

    return myFun;
}

let obj = {
    fun1: function(frnd1, frnd2){
        console.log("Name: "+ this.fullName + " Age: " + this.age + ".");
        console.log(this.fullName + " says Hello to " + frnd1 + ".");
        console.log(this.fullName + " says hello to " + frnd2 + ".");
        console.log(arguments);
    },
    fullName: "Sumeet Malik",
    age: 33

};

let o2 = {
    fullName: "Neha",
    age: 33
};

// obj.fun1.call(o2, "Vikas", "Navdeep", "Jitu", "Rajneesh", "Kapil")
// obj.fun1.apply(o2, ["Vikas","Navdeep","Jitu","Rajneesh","Kapil"]);

let boundFunction = obj.fun1.myBind(o2, "Vikas", "Navdeep", "Jitu", "Rajneesh", "Kapil");
boundFunction("Jasbir", "Pankaj");

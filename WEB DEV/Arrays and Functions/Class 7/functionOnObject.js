let obj = {
    fun: function(){
        console.log("Name: ", this.fullName, " Age: ", this.age);
    },
    fun2: function(){
        console.log("Name: ", fullName, " Age: ", age);
    },
    gun: function(){
        console.log("Name: ", obj.fullName, " Age: ", obj.age);
    },
    fullName: "Parth",
    age: "21"
}

obj.fun();
// obj.fun2();
obj.gun();
function person(name, age){
    this.name = name;
    this.age = age;
    this.sayHi = function(f1){
        console.log(this,name + "[" + this.age +"] says hi to " + f1);
    }
}

let p1 = new person("Parth", 21);
p1.sayHi("Parth's frens");
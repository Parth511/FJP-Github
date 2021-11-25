let obj = {}
let captain = {
    firstName: 'Steve',
    lastname: 'Rogers',
    friends: ['Bucky','Tony','Dr Banner'],
    isAvenger: true,
    age: 150,
    address: {
        state: 'New York',
        city: 'Manhattan',
    },
    sayHi: function fn(){
        console.log('Cap says Hi')
    }
}

console.log(captain)

console.log(captain.firstName)

console.log(captain['age'])

captain.sayHi()

captain.isAvenger = false

console.log(captain.isAvenger)

//create something inside an object

captain.movies = ['first','second'];
console.log(captain.movies)

delete captain.age

console.log(captain)


//special loop (For in loop)
for(let key in captain){
    console.log("Key->",key,"\tValue->",captain[key])
}
let fs = require('fs');

function primeSieve(phandler, nphandler){
    let oarr = this;
    for(let i=0; i<oarr.length; i++){
        let num = oarr[i];
        let isPrime = true;
        for(let div = 2; div*div <= num; div++){
            if(num%div == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime == true){
            phandler(num);
        }else{
            nphandler(num);
        }
    }
}

Array.prototype.sieve = primeSieve;

let arr = [11, 18, 34,37, 49, 53, 71, 84, 97];

if(fs.existsSync("primes.txt")) fs.rmSync("primes.txt");
if(fs.existsSync("nonPrimes.txt")) fs.rmSync("nonPrimes.txt");

arr.sieve(logAllPrimes, logAllNonPrimes);

function logAllPrimes(num){
    console.info('Prime: ' + num);
    fs.appendFileSync("primes.txt", num + '->');
}

function logAllNonPrimes(num){
    console.error('Non Prime: ' + num);
    fs.appendFileSync("nonPrimes.txt", num + '->');
}

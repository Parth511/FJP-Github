#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

bool isUnique(int n){
    int x=n;
    while(n){
        if(n%10==0 || x%(n%10)!=0)
            return false;
        n/=10;
    }
    return true;
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int l,r;
    cin>>l>>r;
    for(int i=l; i<=r; i++){
        if(isUnique(i))
            cout<<i<<" ";
    }
    return 0;
}

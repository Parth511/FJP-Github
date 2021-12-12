#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void print(int n){
    if(n<=0)    return;
    if(n%2) cout<<n<<endl;
    print(n-1);
    if(n%2==0)  cout<<n<<endl;
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    cin>>n;
    print(n);
    return 0;
}

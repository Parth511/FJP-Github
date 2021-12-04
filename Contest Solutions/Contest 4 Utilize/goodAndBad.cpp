#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int t;
    cin>>t;
    while(t--){
        string s;
        cin>>s;
        if(s.find("010")!=string::npos || s.find("101")!=string::npos)
            cout<<"Good"<<endl;
        else
            cout<<"Bad"<<endl;
    }
    return 0;
}
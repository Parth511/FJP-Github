
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n,m;
    cin>>n;
    vector<string> v1(n);
    for(auto &s:v1) cin>>s;
    cin>>m;
    vector<string> v2(m);
    for(auto &s:v2) cin>>s;
    
    string ans1="", ans2="";
    for(auto s:v1)  ans1+=s;
    for(auto s:v2)  ans2+=s;
    if(ans1==ans2)
        cout<<"true"<<endl;
    else
        cout<<"false"<<endl;
    return 0;
}

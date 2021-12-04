#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    cin>>n;
    vector<int> arr(n);
    for(int i=0; i<n; i++)  cin>>arr[i];
    for(int i=0; i<n; i++)
        if(i%10==arr[i]){
            cout<<i<<endl;
            return 0;
        }
    cout<<"-1"<<endl;
    return 0;
}
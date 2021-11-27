//Question
// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

// Input Format

// First line of each test case takes an integer n, size of an array.
// Second line of each test case receives an array arr.
// Constraints

// 1 <= arr.length <= 1000
// -1000 <= arr[i] <= 1000
// Output Format

// Return true or false acc. to desired output.
// Sample Input 0

// 6
// 1 2 2 1 1 3
// Sample Output 0

// true
// Explanation 0

// The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

// Sample Input 1

// 2
// 1 2
// Sample Output 1

// false
// Sample Input 2

// 10
// -3,0,1,-3,1,1,1,-3,10,0
// Sample Output 2

// true

//Solution
#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;cin>>n;
    vector<int> v(n);
    for(auto &i:v){
        cin>>i;
    }
    map<int,int> m;
    for(auto i:v){
        m[i]++;
    }
    
    set<int> s;
    for(auto i:m){
        s.insert(i.second);
    }
    if(m.size()==s.size())
        cout<<"true"<<endl;
    else
        cout<<"false"<<endl;
    return 0;
}
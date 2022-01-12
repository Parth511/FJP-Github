#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    string frequencySort(string s) {
        // make s freq array for all 128 ascii values
        vector<pair<int, char>> v(128);
        
        // make frequency of all of them as 0, 
        // and just to not have to make a comparator function 
        // I made the first element in pair to be the frequency and not second.
        for(int i=0; i<128; i++)    v[i] = {0, i};  // Here  i is stored aftertypecasting as char
        
        // Increase the frequency of all of the characters stored in the string s
        for(int i=0; i<s.size(); i++) v[(int)(s[i])].first++;
        
        // Sorting, this works because My frequency values are all stored in the first element of the pair and not the second element
        sort(v.begin(), v.end());
        s="";       // Initialize the string s as empty
        
        // For all frequencies greater than one, append the string as many times as it's frequency
        for(int i=127; i>=0 && v[i].first!=0; i--)
            while(v[i].first--)    
                s+=v[i].second;
        
        return s;       // return the final string
    }
};
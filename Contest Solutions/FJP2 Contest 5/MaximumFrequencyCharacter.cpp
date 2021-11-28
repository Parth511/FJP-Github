//Question
// 1.Take as input String.

// Write a function that print the character with maximum frequency. Note that the repeated characters need not be adjacent. But, it is guaranteed that all characters are lowercase english alphabets.

// Example(To be used only for expected output):

// Input:
// aabbbccccccc

// output
// c
// Input Format

// String representing S.

// Constraints

// Size of String may be large.

// Output Format

// print the output.

//Solution
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    string s;
    cin >> s;
    int n = s.size();
    map<char, int> m;
    for (int i = 0; i < n; i++)
        m[s[i]]++;
    int maxFreq = 0;
    char c = s[0];
    for (auto it : m)
    {
        if (it.second > maxFreq)
        {
            maxFreq = it.second;
            c = it.first;
        }
    }
    cout << c << endl;

    return 0;
}

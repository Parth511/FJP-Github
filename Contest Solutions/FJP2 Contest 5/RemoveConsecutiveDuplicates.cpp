//Question
// 1.Take as input String.

// Write a function that removes all consecutive duplicates and then print desired
// String.

// Example(To be used only for expected output):

// Input:
// aabbbccccccc

// output
// abc
// Input Format

// String representing S.

// Constraints

// Size of String may be large.

// Output Format

// print the output.

// Sample Input 0

// aabbbccccccc
// Sample Output 0

// abc

//Solution
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    string s;
    cin >> s;
    string ans;
    for (int i = 0; i < s.size(); i++)
    {
        if (i == 0 || s[i] != s[i - 1])
            ans += s[i];
    }
    cout << ans << endl;
    return 0;
}

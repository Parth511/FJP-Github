//Question
// There is a sequence of words in CamelCase as a string of letters, , having the following properties:

// It is a concatenation of one or more words consisting of English letters.
// All letters in the first word are lowercase.
// For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
// Given , determine the number of words in .

// Example

// There are  words in the string: 'one', 'Two', 'Three'.

// Function Description

// Complete the camelcase function in the editor below.

// camelcase has the following parameter(s):

// string s: the string to analyze
// Returns

// int: the number of words in
// Input Format

// A single line containing string .

// Constraints

// Sample Input

// saveChangesInTheEditor
// Sample Output

// 5
// Explanation

// String  contains five words:

// save
// Changes
// In
// The
// Editor

//Solution
#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the 'camelcase' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

int camelcase(string s)
{
    int count = 1;
    for (int i = 0; i < s.size(); i++)
    {
        if (s[i] >= 'A' and s[i] <= 'Z')
            count++;
    }
    return count;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    int result = camelcase(s);

    fout << result << "\n";

    fout.close();

    return 0;
}

//Question
// There is a collection of rocks where each rock has various minerals embeded in it. Each type of mineral is designated by a lowercase letter in the range . There may be multiple occurrences of a mineral in a rock. A mineral is called a gemstone if it occurs at least once in each of the rocks in the collection.

// Given a list of minerals embedded in each of the rocks, display the number of types of gemstones in the collection.

// Example

// The minerals  and  appear in each rock, so there are  gemstones.

// Function Description

// Complete the gemstones function in the editor below.

// gemstones has the following parameter(s):

// string arr[n]: an array of strings
// Returns

// int: the number of gemstones found
// Input Format

// The first line consists of an integer , the size of .
// Each of the next  lines contains a string  where each letter represents an occurence of a mineral in the current rock.

// Constraints

//  | arr[i] |
// Each composition  consists of only lower-case Latin letters ('a'-'z').

// Sample Input

// STDIN       Function
// -----       --------
// 3           arr[] size n = 3
// abcdde      arr = ['abcdde', 'baccd', 'eeabg']
// baccd
// eeabg
// Sample Output

// 2
// Explanation

// Only  and  occur in every rock.

//Solution
#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);

/*
 * Complete the 'gemstones' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING_ARRAY arr as parameter.
 */

int gemstones(vector<string> arr)
{
    int n = arr.size();
    map<char, int> m;
    for (int i = 0; i < n; i++)
    {
        vector<int> freq(26, 0);
        for (int j = 0; j < arr[i].size(); j++)
        {
            if (freq[arr[i][j] - 'a'] == 0)
            {
                m[arr[i][j]]++;
                freq[arr[i][j] - 'a'] = 1;
            }
        }
    }
    int count = 0;
    for (auto it : m)
    {
        if (it.second == n)
            count++;
    }
    return count;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string n_temp;
    getline(cin, n_temp);

    int n = stoi(ltrim(rtrim(n_temp)));

    vector<string> arr(n);

    for (int i = 0; i < n; i++)
    {
        string arr_item;
        getline(cin, arr_item);

        arr[i] = arr_item;
    }

    int result = gemstones(arr);

    fout << result << "\n";

    fout.close();

    return 0;
}

string ltrim(const string &str)
{
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace))));

    return s;
}

string rtrim(const string &str)
{
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end());

    return s;
}

#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int c=matrix[0].size() - 1, r=0;
        while(c>=0 and r<matrix.size()){
            if(matrix[r][c] == target)      return true;
            else if(target < matrix[r][c])  c--;
            else                            r++;
        }
        return false;
    }
};
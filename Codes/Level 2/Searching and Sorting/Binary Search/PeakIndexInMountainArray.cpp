#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int low = 0, n = arr.size(), high = n - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            
            int lval = (mid-1 > 0)?arr[mid-1]:INT_MIN;
            int rval = (mid+1 < n-1)?arr[mid+1]:INT_MIN;
            
            if(arr[mid] > lval && arr[mid] > rval)
                return mid;
            else if(arr[mid] < lval)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
};
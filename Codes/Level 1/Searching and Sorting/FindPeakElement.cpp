#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int n = nums.size(), low = 0, high = n - 1;
        while(low<=high){
            int mid = low + (high - low)/2;
            
            long long lval = (mid > 0)?nums[mid-1]:LONG_MIN;
            long long rval = (mid < n-1)? nums[mid+1]:LONG_MIN;
            
            if(nums[mid]>lval and nums[mid]>rval)
                return mid;
            else if(nums[mid] > lval)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
};
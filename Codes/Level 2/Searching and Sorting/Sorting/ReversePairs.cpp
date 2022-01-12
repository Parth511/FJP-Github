#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    
    int mergeSort(vector<int> &nums, int low, int high){
        if(low >= high)
            return 0;
        int mid = low + ( high - low ) / 2;
        int left = mergeSort(nums, low, mid);
        int right = mergeSort(nums, mid + 1, high);
        int ans = merge(nums, low, mid, mid + 1, high);
        return left + right + ans;
    }
    
    int merge(vector<int> &nums, int left1, int right1, int left2, int right2){
        int length = (right2 - left2 + 1) + (right1 - left1 + 1);
        vector<int> res(length);
        
        int Count = 0, i = left1, j = left2, k = 0;
        while(i<=right1 and j<=right2){
            if(nums[i] > (long)2*nums[j]){
                Count += (right1 - i + 1);
                j++;
            }else{
                i++;
            }
        }
        
        i = left1, j = left2;
        while(i <= right1 && j <= right2){
            if(nums[i] <= nums[j]){
                res[k++] = nums[i++];
            }else{
                res[k++] = nums[j++];
            }
        }
        while(i <= right1)  res[k++] = nums[i++];
        while(j <= right2)  res[k++] = nums[j++];  
        for(i = left1; i <= right2; i++)    nums[i] = res[i-left1];
        return Count;
    }
    
    int reversePairs(vector<int>& nums) {
        int count = mergeSort(nums, 0, nums.size()-1);
        // for(auto num:nums)  cout<<num<<" ";
        return count;
    }
};
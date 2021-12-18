#include<bits/stdc++.h>
using namespace std;


class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        if(nums1.size() > nums2.size())
            return findMedianSortedArrays(nums2, nums1);
        int n = nums1.size(), m = nums2.size();
        int low = 0, high = n;
        int N = n + m, Nby2 = (N + 1)/2;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            
            int aleft = (mid > 0) ? nums1[mid - 1] : INT_MIN;
            int aright = (mid < n) ? nums1[mid] : INT_MAX;
            
            int bleft = (Nby2 - mid > 0) ? nums2[Nby2 - mid - 1] : INT_MIN;
            int bright = (Nby2 - mid < m) ? nums2[Nby2 - mid] : INT_MAX;
            
            if(aleft <= bright and bleft <= aright){
                if(N%2)
                    return max(aleft, bleft);
                else{
                    int arr[] = {aleft, aright, bleft, bright};
                    sort(arr, arr+4);
                    return (arr[1] + arr[2])/2.0;
                }
            }else if(aleft > bright){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return 0;
    }
};
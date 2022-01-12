#include<bits/stdc++.h>
using namespace std;

int binarySearch(vector<int> &A, int left, int right, int target, bool isInc){
        if(left > right)    return -1;
        int mid = left+(right-left)/2;
        if(A[mid]==target)  return mid;
        if(A[mid] < target and isInc || (!isInc and A[mid] > target))   
            return binarySearch(A, mid + 1, right, target, isInc);
        else    
            return binarySearch(A, left, mid - 1, target, isInc);
}

int solve(vector<int> &A, int B) {
    int low = 0, high = A.size(), peak, n = A.size();
    while(low <= high){
        int mid = low + (high - low)/2;

        int lval = (mid>0)?A[mid-1]:INT_MIN;
        int rval = (mid<n-1)?A[mid+1]:INT_MIN;

        if(A[mid]>lval and A[mid]>rval){
            peak = mid;
            break;
        }else if(A[mid] > lval){
            low = mid + 1;
        }else{
            high = mid - 1;
        }
    }

    if(A[peak] == B)    return true;
    if(A[peak] < B)     return false;
    int foundVal = binarySearch(A, 0, peak-1, B, true);
    if(foundVal != -1)
        return foundVal;
    return binarySearch(A, peak+1, n-1, B, false);
}
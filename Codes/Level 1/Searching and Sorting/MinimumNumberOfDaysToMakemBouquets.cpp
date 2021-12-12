#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    
    bool isPossible(int day, vector<int> &bloomDay, int m, int k){
        int flowers = 0, bouquet = 0;
        for(int i=0; i<bloomDay.size(); i++){
            if(bloomDay[i]<=day){
                flowers++;
            }else{
                flowers=0;
            }
            if(flowers == k){
                bouquet++;
                flowers=0;
            }
            
            if(bouquet==m)
                return true;
        }
        return false;
    }
    
    int minDays(vector<int>& bloomDay, int m, int k) {
        int low = 0, high = bloomDay[0];
        
        for(int i=0; i<bloomDay.size(); i++)
            high = max(high, bloomDay[i]);
        
        int ans = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(isPossible(mid, bloomDay, m, k)){
                ans = mid;
                high = mid - 1;
            }else
                low = mid + 1;
        }
        return ans;
    }
};
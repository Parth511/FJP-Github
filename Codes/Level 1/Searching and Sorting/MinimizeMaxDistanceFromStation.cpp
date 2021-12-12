#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    /**
     * @param stations: an integer array
     * @param k: an integer
     * @return: the smallest possible value of D
     */
    
    bool isPossible(double mid, vector<int> &stations, int k){
        double placed = 0;
        for(int i=1; i<stations.size(); i++){
            double currDis = stations[i] - stations[i-1];
            if(currDis >= k){
                placed += floor(currDis/mid);
            }
        }
        return placed<=k;
    }
    
    double minmaxGasDist(vector<int> &stations, int k) {
        // Write your code here
        double left = 0, right = 1e8, ans = right;
        while(right - left > 1e-6){
            double mid = left + (right - left)/2;
            if(isPossible(mid, stations, k)){
                right = mid;
                ans = mid;
            }
            else
                left = mid;
        }
        return ans;
    }
};
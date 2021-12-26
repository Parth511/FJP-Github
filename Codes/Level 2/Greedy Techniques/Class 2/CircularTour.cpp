#include<bits/stdc++.h>
using namespace std;

// Not the most optimized, but accepted
class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int n = gas.size();
        for(int i=0; i<n; i++){
            long long sum = 0, count = 0;
            for(int j=i; j<2*n; j++){
                sum += gas[j%n];
                sum -= cost[j%n];
                if(sum<0){
                    i = j;
                    break;
                }
            }
            if(sum<0)   continue;
            return i;
        }
        return -1;
    }
};
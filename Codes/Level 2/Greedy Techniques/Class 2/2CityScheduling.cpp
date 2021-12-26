class Solution {
public:
    
    static bool cmp(vector<int> &a, vector<int> &b){
        return (a[1] - a[0]) < (b[1] - b[0]);
    }
    
    int twoCitySchedCost(vector<vector<int>>& costs) {
        // sort(costs.begin(), costs.end(), cmp);
        sort(costs.begin(), costs.end(), [](vector<int> &a, vector<int> &b){ return (a[1] - a[0]) < (b[1] - b[0]); });
        int sum = 0, n = costs.size();
        for(int i=0; i<n/2; i++)
            sum += (costs[i][1] + costs[n-1-i][0]);
        return sum;
    }
};
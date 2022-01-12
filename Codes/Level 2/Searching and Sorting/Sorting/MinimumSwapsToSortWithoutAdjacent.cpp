#include<bits/stdc++.h>
using namespace std;

class Solution 
{
    public:
    
    int cycleSize(vector<pair<int, int>> &arr, int start, vector<bool> &vis){
        int res = 0, j = start;
        while(!vis[j]){
            vis[j] = true;
            j = arr[j].second;
            res++;
        }
        return res - 1;
    }
    
    //Function to find the minimum number of swaps required to sort the array. 
	int minSwaps(vector<int>&a)
	{
	    // Code here
	    int n = a.size();
	    vector<pair<int, int>> arr(n);
	    for(int i=0; i<n; i++)  arr[i] = {a[i], i};
	    sort(arr.begin(), arr.end());
	    vector<bool> vis(n, false);
	    int res = 0;
	    for(int i=0; i<n; i++)
	        if(vis[i] == false)
	            res += cycleSize(arr, i, vis);
	    return res;
	}
};
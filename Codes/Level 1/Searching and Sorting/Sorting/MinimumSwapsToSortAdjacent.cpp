#include <bits/stdc++.h>
using namespace std;


class Solution{
public:	

    int countInversions(int arr[], int low, int high){
        if(low >= high){
            return 0;
        }
        int mid = low + (high - low) / 2;
        int leftCount = countInversions(arr, low, mid);
        int rightCount = countInversions(arr, mid + 1, high);
        int currAns = merge(arr, low, mid, mid + 1, high);
        return leftCount + rightCount + currAns;
    }
    
    int merge(int arr[], int left1, int right1, int left2, int right2){
        int length = (right1 - left1 + 1) + (right2 - left2 + 1);
        int res[length], count = 0;
        int i = left1, j = left2, k = 0;
        while(i<=right1 && j<=right2){
            if(arr[i] <= arr[j]){
                res[k++] = arr[i++];
            }else{
                count += (right1 - i + 1);
                res[k++] = arr[j++];
            }
        }
        while(i<=right1)    res[k++] = arr[i++];
        while(j<=right2)    res[k++] = arr[j++];
        for(i = left1; i<=right2; i++)  arr[i] = res[i-left1];
        return count;
    }
		
	int countSwaps(int arr[], int n)
	{
	    // Your code goes here
	    return countInversions(arr, 0, n-1);
	}
};

// { Driver Code Starts.

int main() 
{
   
   	ios_base::sync_with_stdio(0);
    cin.tie(NULL);
    cout.tie(NULL);
   
   	int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;

        int arr[n];
        for(int i = 0; i < n; i++)
        	cin >> arr[i];

        Solution ob;
        cout << ob.countSwaps(arr, n);

        cout << "\n";
    }

    return 0;
}  // } Driver Code Ends
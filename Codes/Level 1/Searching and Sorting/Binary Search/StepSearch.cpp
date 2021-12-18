#include<bits/stdc++.h>

int search(int arr[], int n, int x, int k)
{
    // Complete the function
    int jump=0;
    for(int i=0; i<n;){
        if(arr[i]==x)   return i;
        jump = abs(x - arr[i])/k;
        i+=(jump==0?1:jump);
    }
    return -1;
}    	
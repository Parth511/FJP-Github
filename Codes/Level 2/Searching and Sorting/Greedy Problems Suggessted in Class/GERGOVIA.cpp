#include<bits/stdc++.h>
using namespace std;
#define int long long
int32_t main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin>>n;
    while(n){
        vector<int> a(n);
        for(auto &i:a)  cin>>i;
        int work = 0;
        for(int i=1; i<n; i++){
            a[i]+=a[i-1];
            work += abs(a[i-1]);
        }
        cout<<work<<endl;
        cin>>n;
    }

    return 0;
}
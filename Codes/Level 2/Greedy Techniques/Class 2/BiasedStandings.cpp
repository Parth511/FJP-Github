#include<bits/stdc++.h>
using namespace std;
#define int long long
int32_t main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<pair<string, int>> v(n);
        for(auto &i:v)  cin>>i.first>>i.second;
        sort(v.begin(), v.end(), [](pair<string, int> &a, pair<string, int> &b){return a.second < b.second;});
        int ans = 0;
        for(int i=0; i<n; i++)
            ans += (abs(v[i].second - (i+1)));
        cout<<ans<<endl;
    }
    return 0;
}
#include<bits/stdc++.h>
using namespace std;
#define int long long
    

    
int32_t main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int t;
    cin>>t;
    while(t--){
        int n,x;
        cin>>n;
        string s;
        vector<pair<int, string>> v;
        for(int i=0; i<n; i++){
            cin>>s>>x;
            v.push_back({x, s});
        }
        sort(v.begin(), v.end());
        int count = 0;
        for(int i=0; i<n; i++){
            if(v[i].first != i+1)
                count += (abs(v[i].first - (i+1)));
        }
        cout<<count<<endl;
    }

    return 0;
}
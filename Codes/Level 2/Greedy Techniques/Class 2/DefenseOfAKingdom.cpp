#include<bits/stdc++.h>
using namespace std;
#define int long long
int32_t main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int t;
    cin>>t;
    while(t--){
        int w, h, n;
        cin>>w>>h>>n;
        vector<int> rows = {0}, cols = {0};
        for(int i=0; i<n; i++){
            int x, y;
            cin >> x >> y;
            rows.push_back(y);
            cols.push_back(x);
        }
        rows.push_back(h + 1);
        cols.push_back(w + 1);
        sort(rows.begin(), rows.end());
        sort(cols.begin(), cols.end());
        int maxDiffRow = 0, maxDiffCol = 0;

        for(int i=1; i<rows.size(); i++)
            maxDiffRow = max(maxDiffRow, rows[i] - rows[i-1] - 1);
        for(int i=1; i<cols.size(); i++)
            maxDiffCol = max(maxDiffCol, cols[i] - cols[i-1] - 1);
        cout<<maxDiffCol*maxDiffRow<<endl;
    }

    return 0;
}
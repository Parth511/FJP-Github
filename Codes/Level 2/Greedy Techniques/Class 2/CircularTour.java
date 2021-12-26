

// most otimized solution
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        
        int extra = 0, start = 0, deficit = 0;
        
        for(int i=0; i<n; i++){
            extra = extra + (gas[i] - cost[i]);
            if(extra < 0){
                start = i + 1;
                deficit -= extra;
                extra = 0;
            }
        }
        if(extra >= deficit)    return start;
        return -1;
    }
}
class Solution {
    
    public static class Pair implements Comparable<Pair>{
        int start, end;
        
        Pair(int start, int end){
            this.start = start;
            this.end = end;
        }
        
        public int compareTo(Pair other){
            return this.end - other.end;
        }
    }
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        
        Pair[] intervals = new Pair[n];
        
        for(int i=0; i<n; i++){
            intervals[i] = new Pair(pairs[i][0], pairs[i][1]);
        }
        
        Arrays.sort(intervals);
        
        int ans = 0, limit = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            if(intervals[i].start > limit){
                ans ++;
                limit = Math.max(limit, intervals[i].end);
            }
        }
        return ans;
    }
}
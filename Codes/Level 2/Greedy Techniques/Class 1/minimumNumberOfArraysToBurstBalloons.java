class Solution {
    
    public static class Pair implements Comparable<Pair>{
        int start, end;
        
        Pair(int start, int end){
            this.start = start;
            this.end = end;
        }
        
        public int compareTo(Pair other){
            return this.end < other.end ? -1 : +1;
        }
    }
    
    public int findMinArrowShots(int[][] pairs) {
        int n = pairs.length;
        
        Pair[] intervals = new Pair[n];
        
        for(int i=0; i<n; i++){
            intervals[i] = new Pair(pairs[i][0], pairs[i][1]);
        }
        
        Arrays.sort(intervals);
        
        long ans = 0, limit = Long.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(intervals[i].start > limit){
                ans++;
                limit = Math.max(limit, intervals[i].end);
            }
        }
        return (int)ans;
    }
}
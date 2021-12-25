class Solution {
    
    public static class Interval{
        int start;
        int end;
        Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    
    public static class MyComparator implements Comparator<Interval>{
        public int compare(Interval obj1, Interval obj2){
            if(obj1.end!=obj2.end)
                return obj1.end - obj2.end;
            return obj1.start - obj2.start;
        }
    }
    
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        Interval[] intervals = new Interval[n];
        
        for(int i=0; i<n; i++){
            intervals[i] = new Interval(start[i], end[i]);
        }
        
        
        Arrays.sort(intervals, new MyComparator());

        int limit = Integer.MIN_VALUE; // last interval ending time
        int count = 0;

        for(int i=0; i<n; i++){
            if(limit < intervals[i].start){
                limit = intervals[i].end;
                count++;
            }
        }

        return count;
    }
    
    public int eraseOverlapIntervals(int[][] times) {
        int n = times.length;
        Interval[] intervals = new Interval[n];
        for(int i=0; i<n; i++){
            intervals[i] = new Interval(times[i][0], times[i][1]);
        }
        
        
        Arrays.sort(intervals, new MyComparator());

        int limit = Integer.MIN_VALUE; // last interval ending time
        int count = 0;

        for(int i=0; i<n; i++){
            if(limit <= intervals[i].start){
                limit = intervals[i].end;
                count++;
            }
        }

        return n - count;
    }
}
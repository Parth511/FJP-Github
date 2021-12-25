/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */
import java.util.*;

public class Solution {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: if a person could attend all meetings
     */

    public static class MyComparator implements Comparator<Interval>{
        public int compare(Interval obj1, Interval obj2){
            if(obj1.end != obj2.end)
                return obj1.end - obj2.end;
            return obj1.start - obj2.start;
        }
    }

    public boolean canAttendMeetings(List<Interval> intervals) {
        // Write your code here
        Collections.sort(intervals, new MyComparator());

        int limit = Integer.MIN_VALUE; // last interval ending time
        int count = 0;

        for(int i=0; i<intervals.size(); i++){
            if(limit > intervals.get(i).start){
                return false;
            }
            limit = intervals.get(i).end;
            count++;
        }

        return true;
    }
}
        
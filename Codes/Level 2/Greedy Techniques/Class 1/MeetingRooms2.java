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

public class Solution {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: the minimum number of conference rooms required
     */
    public int minMeetingRooms(List<Interval> intervals) {
        // Write your code here
        ArrayList<Integer> start = new ArrayList<>();
        ArrayList<Integer> end = new ArrayList<>();
        for(int i=0; i<intervals.size(); i++){
            start.add(intervals.get(i).start);
            end.add(intervals.get(i).end);
        }

        Collections.sort(start);
        Collections.sort(end);

        int currRooms = 0, maxRooms = 0;
        int startIdx = 0, endIdx = 0;
        while(startIdx < intervals.size()){
            if(start.get(startIdx) < end.get(endIdx)){
                currRooms++;
                startIdx++;
            }else if(start.get(startIdx) > end.get(endIdx)){
                currRooms--;
                endIdx++;
            }else{
                startIdx++;
                endIdx++;
            }
            maxRooms = Math.max(maxRooms, currRooms);
        }

        return maxRooms;
    }
}
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
        int n = intervals.size();
        int[] startArr = new int[n], endArr = new int[n];
        for(int i=0; i<n; i++){
            startArr[i] = intervals.get(i).start;
            endArr[i] = intervals.get(i).end;
        }

        Arrays.sort(startArr);
        Arrays.sort(endArr);

        int i=0, j=0, Rooms = 0, maxRooms = 0;
        while(i < n && j < n){
            if(startArr[i] < endArr[j]){
                Rooms++;
                i++;
            }else{
                Rooms--;
                j++;
            }
            maxRooms = Math.max(Rooms, maxRooms);
        }
        
        return maxRooms;
    }
}
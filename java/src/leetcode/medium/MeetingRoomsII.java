/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        if(intervals == null || intervals.length == 0) return 0;
        int maxVal = 1;
        int[] startArr = new int[intervals.length];
        int[] endArr = new int[intervals.length];

        for(int i = 0; i < intervals.length; i++) {
            startArr[i] = intervals[i].start;
            endArr[i] = intervals[i].end;
        }
        Arrays.sort(startArr); Arrays.sort(endArr);
        
        int i = 0, j = 0, count = 0;
        while(i < startArr.length && j < endArr.length) {
            if(startArr[i] < endArr[j]) {
                count++; i++;
            } else {
                count--; j++;
            }
            if(count > maxVal) maxVal = count;
        }
        
        return maxVal;
    }
}

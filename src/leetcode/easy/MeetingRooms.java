package leetcode.easy;

import common.Interval;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Question: https://leetcode.com/problems/meeting-rooms/description/
 */
public class MeetingRooms {
    public boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals, (i1, i2) -> Integer.valueOf(i1.end).compareTo(i2.end));

        int prev = 0;
        for (int i = 0; i < intervals.length; i++) {
            Interval interval = intervals[i];
            if (interval.start < prev) {
                return false;
            }
            prev = interval.end;
        }

        return true;
    }
}

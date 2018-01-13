/**
 * Definition for an interval.
 * function Interval(start, end) {
 *     this.start = start;
 *     this.end = end;
 * }
 */
/**
 * @param {Interval[]} intervals
 * @return {boolean}
 */
var canAttendMeetings = function(intervals) {
    intervals.sort(function(interval, interval2){
       return interval.start - interval2.start;
    });

    for(let i = 1; i < intervals.length; i++) {
        if(intervals[i].start < intervals[i-1].end) {
            return false;
        }
    }

    return true;
};

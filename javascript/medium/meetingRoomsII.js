/**
 * Definition for an interval.
 * function Interval(start, end) {
 *     this.start = start;
 *     this.end = end;
 * }
 */
/**
 * @param {Interval[]} intervals
 * @return {number}
 */
var minMeetingRooms = function(intervals) {
    const startIntervals = new Array(), endIntervals = new Array();
    for(let interval of intervals) {
        startIntervals.push(interval.start);
        endIntervals.push(interval.end);
    }
    startIntervals.sort(function(x, y) { return x-y; });
    endIntervals.sort(function(x, y) { return x-y; });
    let i = 0, j = 0, count = 0, minRooms = 0;
    while(i < startIntervals.length && j < endIntervals.length) {
        if(startIntervals[i] < endIntervals[j]) {
            count++; i++;
        } else {
            count--; j++;
        }
        minRooms = Math.max(minRooms, count);
    }
    return minRooms;
};

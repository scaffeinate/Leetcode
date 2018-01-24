/**
 * Definition for an interval.
 * function Interval(start, end) {
 *     this.start = start;
 *     this.end = end;
 * }
 */
/**
 * @param {Interval[]} intervals
 * @return {Interval[]}
 */
var merge = function(intervals) {
    const res = new Array();
    if(intervals.length === 0) return res;
    intervals.sort(function(i1, i2){ return i1.start - i2.start; });
    let start = intervals[0].start, end = intervals[0].end;
    for(let i = 1; i < intervals.length; i++) {
        const interval = intervals[i];
        if(interval.start <= end) {
            end = Math.max(end, interval.end);
        } else {
            res.push([start, end]);
            start = interval.start;
            end = interval.end;
        }
    }
    res.push([start, end]);
    return res;
};

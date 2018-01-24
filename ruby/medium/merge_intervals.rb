# Definition for an interval.
# class Interval
#     attr_accessor :start, :end
#     def initialize(s=0, e=0)
#         @start = s
#         @end = e
#     end
# end

# @param {Interval[]} intervals
# @return {Interval[]}
def merge(intervals)
    res = Array.new
    return res if intervals.empty?
    intervals.sort! { |i1, i2| i1.start <=> i2.start }
    start, stop = intervals[0].start, intervals[0].end
    for i in 1..intervals.length-1
        interval = intervals[i]
        if interval.start <= stop
            stop = [stop, interval.end].max
        else
            res.push([start, stop])
            start = interval.start
            stop = interval.end
        end
    end
    res.push([start, stop])
    return res
end

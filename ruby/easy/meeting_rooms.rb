# Definition for an interval.
# class Interval
#     attr_accessor :start, :end
#     def initialize(s=0, e=0)
#         @start = s
#         @end = e
#     end
# end

# @param {Interval[]} intervals
# @return {Boolean}
def can_attend_meetings(intervals)
    intervals.sort! do |interval, interval2|
        interval.start <=> interval2.start
    end
    intervals.each_with_index do |interval, i|
        return false if i > 0 && intervals[i].start < intervals[i-1].end
    end
    return true
end

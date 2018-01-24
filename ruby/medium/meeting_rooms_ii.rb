
# Definition for an interval.
# class Interval
#     attr_accessor :start, :end
#     def initialize(s=0, e=0)
#         @start = s
#         @end = e
#     end
# end

# @param {Interval[]} intervals
# @return {Integer}
def min_meeting_rooms(intervals)
    return 0 if intervals.empty?
    start_intervals, end_intervals = Array.new, Array.new
    intervals.each do |interval|
        start_intervals.push(interval.start)
        end_intervals.push(interval.end)
    end
    start_intervals.sort!
    end_intervals.sort!
    i, j, num_rooms, min_rooms = 0, 0, 0, 0
    while i < start_intervals.length && j < end_intervals.length
        if start_intervals[i] < end_intervals[j]
            num_rooms += 1
            i += 1
        else
            num_rooms -= 1
            j += 1
        end
        min_rooms = [min_rooms, num_rooms].max
    end
    return min_rooms
end

class MovingAverage

=begin
    Initialize your data structure here.
    :type size: Integer
=end
    def initialize(size)
        @size = size
        @queue = Array.new()
        @sum = 0
    end


=begin
    :type val: Integer
    :rtype: Float
=end
    def next(val)
        if(@queue.length >= @size)
            @sum -= @queue.shift
        end
        @queue.push(val)
        @sum += val
        return (@sum.to_f/@queue.length)
    end


end

# Your MovingAverage object will be instantiated and called as such:
# obj = MovingAverage.new(size)
# param_1 = obj.next(val)

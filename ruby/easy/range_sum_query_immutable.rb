class NumArray

=begin
    :type nums: Integer[]
=end
    def initialize(nums)
        @sums = Array.new
        sum = 0
        nums.each do |num|
            sum += num
            @sums.push(sum)
        end
    end


=begin
    :type i: Integer
    :type j: Integer
    :rtype: Integer
=end
    def sum_range(i, j)
        return @sums[j] - ((i > 0) ? @sums[i-1] : 0)
    end


end

# Your NumArray object will be instantiated and called as such:
# obj = NumArray.new(nums)
# param_1 = obj.sum_range(i, j)

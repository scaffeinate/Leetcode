class TwoSum

=begin
    Initialize your data structure here.
=end
    def initialize()
        @set = {}
    end


=begin
    Add the number to an internal data structure..
    :type number: Integer
    :rtype: Void
=end
    def add(number)
        if @set[number]
            @set[number] = @set[number]+1
        else
            @set[number] = 1
        end
    end


=begin
    Find if there exists any pair of numbers which sum is equal to the value.
    :type value: Integer
    :rtype: Boolean
=end
    def find(value)
        @set.each do |k,v|
            return true if ((value-k) == k) ? @set[value-k] > 1 : @set[value - k]
        end
        return false
    end


end

# Your TwoSum object will be instantiated and called as such:
# obj = TwoSum.new()
# obj.add(number)
# param_2 = obj.find(value)

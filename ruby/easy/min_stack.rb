class MinStack

=begin
    initialize your data structure here.
=end
    def initialize()
        @stack = Array.new
    end


=begin
    :type x: Integer
    :rtype: Void
=end
    def push(x)
        if @stack.empty?
            @stack.push([x, x])
        else
            @stack.push([x, [x, @stack.last[1]].min])
        end
    end


=begin
    :rtype: Void
=end
    def pop()
        @stack.pop unless @stack.empty?
    end


=begin
    :rtype: Integer
=end
    def top()
        @stack.last[0] unless @stack.empty?
    end


=begin
    :rtype: Integer
=end
    def get_min()
        @stack.last[1] unless @stack.empty?
    end


end

# Your MinStack object will be instantiated and called as such:
# obj = MinStack.new()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.get_min()

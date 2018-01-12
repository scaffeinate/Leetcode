class MyStack

=begin
    Initialize your data structure here.
=end
    def initialize()
        @queue = Array.new
        @queue2 = Array.new
        @push_queue = @queue
        @pop_queue = @queue2
    end


=begin
    Push element x onto stack.
    :type x: Integer
    :rtype: Void
=end
    def push(x)
        @push_queue.push(x)
        pipe()
        swap()
    end


=begin
    Removes the element on top of the stack and returns that element.
    :rtype: Integer
=end
    def pop()
        res = @pop_queue.shift()
        return res
    end


=begin
    Get the top element.
    :rtype: Integer
=end
    def top()
        return @pop_queue.first
    end


=begin
    Returns whether the stack is empty.
    :rtype: Boolean
=end
    def empty()
        @push_queue.empty? and @pop_queue.empty?
    end

    private
    def pipe
        while !@pop_queue.empty?
            @push_queue.push(@pop_queue.shift())
        end
    end

    def swap
        temp = @push_queue
        @push_queue = @pop_queue
        @pop_queue = temp
    end
end

# Your MyStack object will be instantiated and called as such:
# obj = MyStack.new()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()
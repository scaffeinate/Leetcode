class MyQueue

=begin
    Initialize your data structure here.
=end
    def initialize()
        @push_stack = []
        @pop_stack = []
    end


=begin
    Push element x to the back of queue.
    :type x: Integer
    :rtype: Void
=end
    def push(x)
        @push_stack.push(x)
    end


=begin
    Removes the element from in front of queue and returns that element.
    :rtype: Integer
=end
    def pop()
        copy(@push_stack, @pop_stack) if @pop_stack.empty?
        @pop_stack.pop
    end


=begin
    Get the front element.
    :rtype: Integer
=end
    def peek()
        copy(@push_stack, @pop_stack) if @pop_stack.empty?
        @pop_stack.last
    end


=begin
    Returns whether the queue is empty.
    :rtype: Boolean
=end
    def empty()
        @push_stack.empty? && @pop_stack.empty?
    end

    private
    def copy(from, to)
        while(!from.empty?)
            to.push(from.pop)
        end
    end
    
end

# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue.new()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()
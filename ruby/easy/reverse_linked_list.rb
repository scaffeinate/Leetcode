# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val)
#         @val = val
#         @next = nil
#     end
# end

# @param {ListNode} head
# @return {ListNode}
def reverse_list(head)
    return nil unless head
    current, runner = head, head.next
    head.next = nil
    while runner
        temp = runner.next
        runner.next = current
        current = runner and runner = temp
    end
    return current
end
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
def delete_duplicates(head)
    return nil unless head
    current, runner = head, head.next
    while(runner)
        if current.val != runner.val
            current.next = runner
            current = current.next
        end
        runner = runner.next
    end
    current.next = nil if current
    return head
end

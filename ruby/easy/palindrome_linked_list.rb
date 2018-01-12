# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val)
#         @val = val
#         @next = nil
#     end
# end

# @param {ListNode} head
# @return {Boolean}
def is_palindrome(head)
    return true unless head
    center,runner = head,head
    while(runner && runner.next)
        center = center.next
        runner = runner.next.next
    end
    current,runner = center,center.next
    center.next = nil
    while(runner)
        temp = runner.next
        runner.next = current
        current = runner
        runner = temp
    end
    while(head && current)
        return false if(head.val != current.val)
        head = head.next
        current = current.next
    end
    true
end
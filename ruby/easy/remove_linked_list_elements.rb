# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val)
#         @val = val
#         @next = nil
#     end
# end

# @param {ListNode} head
# @param {Integer} val
# @return {ListNode}
def remove_elements(head, val)
    while head && head.val == val
        head = head.next
    end
    current = head
    while(current && current.next)
        if(current.next.val == val)
            current.next = current.next.next
        else 
            current = current.next
        end
    end
    return head
end
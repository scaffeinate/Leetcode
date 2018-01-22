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
def odd_even_list(head)
    return nil unless head
    odd_list, even_list = {head: nil, tail:nil}, {head: nil, tail:nil}
    odd_p, even_p = head, head.next
    while even_p && even_p.next
        add_node(odd_list, odd_p)
        add_node(even_list, even_p)
        
        odd_p = odd_p.next.next
        even_p = even_p.next.next
    end
    add_node(odd_list, odd_p)
    add_node(even_list, even_p)
    
    odd_list[:tail].next = even_list[:head]
    return odd_list[:head]
end

def add_node(obj, node)
    if obj[:head].nil?
        obj[:head] = obj[:tail] = node
    else
        obj[:tail].next = node
        obj[:tail] = node
    end
end

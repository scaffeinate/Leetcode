# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val)
#         @val = val
#         @next = nil
#     end
# end

# @param {ListNode} l1
# @param {ListNode} l2
# @return {ListNode}
def add_two_numbers(l1, l2)
    obj = { head: nil, tail: nil, carry: 0 }
    while l1 || l2
        if l1 && l2
            insert(obj, (l1.val + l2.val))
            l1 = l1.next
            l2 = l2.next
        elsif l1
            insert(obj, l1.val)
            l1 = l1.next
        else
            insert(obj, l2.val)
            l2 = l2.next
        end
    end
    insert(obj, 0) if obj[:carry] > 0
    return obj[:head]
end

def insert(obj, sum)
    sum = sum + obj[:carry]
    obj[:carry] = (sum/10)
    node = ListNode.new(sum % 10)
    if obj[:head].nil?
        obj[:head] = obj[:tail] = node
    else
        obj[:tail].next = node
        obj[:tail] = node
    end
end

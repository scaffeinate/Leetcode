# # Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val)
#         @val = val
#         @next = nil
#     end
# end

def get_intersection_node(a, b)
    len_a = len(a)
    len_b = len(b)
    if len_a > len_b
        while(len_b < len_a)
            a = a.next
            len_b += 1
        end
    elsif len_b > len_a
        while(len_a < len_b)
            b = b.next
            len_a += 1
        end
    end
    while a && b
        return a if a == b
        a = a.next
        b = b.next
    end
    return nil
end

def len(n)
    len = 0
    while(n)
        len += 1
        n = n.next
    end
    return len
end

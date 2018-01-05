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
def merge_two_lists(l1, l2)
  obj = { head: nil, tail: nil }
  while(l1 && l2)
    if(l1.val < l2.val)
      add(l1, obj)
      l1 = l1.next
    else
      add(l2, obj)
      l2 = l2.next
    end
  end

  add(l1, obj) if l1
  add(l2, obj) if l2

  return obj[:head]
end

def add(l, obj)
  if(obj[:head].nil?)
    obj[:head] = obj[:tail] = l
  else
    obj[:tail].next = l
    obj[:tail] = l
  end
end
#Definition for singly-linked list.
class ListNode
    attr_accessor :val, :next
    def initialize(val)
        @val = val
        @next = nil
    end
end

# @param {ListNode} l1
# @param {ListNode} l2
# @return {ListNode}
def add_two_numbers(l1, l2)
    res = { head: nil, tail: nil, carry: 0 }
    while !l1.nil? and !l2.nil?
      add(res, (l1.val + l2.val))
      l1 = l1.next
      l2 = l2.next
    end
    
    while !l1.nil?
      add(res, l1.val)
      l1 = l1.next
    end
    
    while !l2.nil?
      add(res, l2.val)
      l2 = l2.next
    end
    
    add(res, 0) if res[:carry] > 0
    return res[:head]
end

def add(res, val)
  sum = val + res[:carry]
  res[:carry] = (sum/10).to_i
  node = ListNode.new(sum%10)
  if res[:head].nil?
    res[:head] = res[:tail] = node
  else 
    res[:tail].next = node
    res[:tail] = node
  end
end

p add_two_numbers(ListNode.new(0), ListNode.new(1))
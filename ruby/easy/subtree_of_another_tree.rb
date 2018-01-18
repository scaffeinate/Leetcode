# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} s
# @param {TreeNode} t
# @return {Boolean}
def is_subtree(s, t)
    queue = []
    queue.push(s) if s
    while !queue.empty?
        current = queue.shift
        return true if matches(current, t)
        queue.push(current.left) if current.left
        queue.push(current.right) if current.right
    end
    return false
end

def matches(s, t)
    if(s.nil? || t.nil?)
        return (s.nil? && t.nil?)
    end
    return s.val == t.val && matches(s.left, t.left) && matches(s.right, t.right)
end

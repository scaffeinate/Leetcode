# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @return {Boolean}
def is_balanced(root)
    return check_balanced(root) != -1
end

def check_balanced(root)
    return 0 unless root
    left = check_balanced(root.left)
    right = check_balanced(root.right)
    return (left == -1 || right == -1 || (left-right).abs > 1) ? -1 : [left, right].max + 1;
end

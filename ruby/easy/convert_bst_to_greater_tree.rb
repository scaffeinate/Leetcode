# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @return {TreeNode}
def convert_bst(root)
    return sum_up_bst(root, 0)[:root]
end

def sum_up_bst(root, higher_sum)
    return {sum: 0} unless root
    right = sum_up_bst(root.right, higher_sum)
    left = sum_up_bst(root.left, (higher_sum + root.val + right[:sum]))
    sum = root.val + left[:sum] + right[:sum]
    root.val += higher_sum + right[:sum]
    return { sum: sum, root: root }
end

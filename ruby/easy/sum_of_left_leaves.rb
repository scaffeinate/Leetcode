# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @return {Integer}
def sum_of_left_leaves(root)
    return calculate_sum(root, false)
end

def calculate_sum(root, is_left)
    return 0 unless root
    return root.val if (is_left && root.left.nil? && root.right.nil?)
    return calculate_sum(root.left, true) + calculate_sum(root.right, false)
end

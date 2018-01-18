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
def find_tilt(root)
    obj = { tilt: 0 }
    find_tree_tilt(root, obj)
    return obj[:tilt]
end

def find_tree_tilt(root, obj)
    return 0 unless root
    left_sum = find_tree_tilt(root.left, obj)
    right_sum = find_tree_tilt(root.right, obj)
    obj[:tilt] += (left_sum - right_sum).abs
    return root.val + left_sum + right_sum
end

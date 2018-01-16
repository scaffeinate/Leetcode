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
def get_minimum_difference(root)
    hash = { min: nil, prev: nil }
    min_abs_distance(root, hash)
    return hash[:min] ? hash[:min] : 0
end

def min_abs_distance(root, hash)
    return unless root
    min_abs_distance(root.left, hash)
    if hash[:prev]
        min = hash[:min]
        diff = (root.val - hash[:prev]).abs
        hash[:min] = min ? [min, diff].min : diff
    end
    hash[:prev] = root.val
    min_abs_distance(root.right, hash)
end

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
def find_second_minimum_value(root)
    second_min = find_second_minimum(root, root.val)
    return (second_min == ((2 ** 31) - 1)) ? -1 : second_min
end

def find_second_minimum(root, min)
    return ((2 ** 31) - 1) if root.nil?
    second_min = (root.val > min) ? root.val : ((2 ** 31) - 1)
    return [second_min, find_second_minimum(root.left, min), find_second_minimum(root.right, min)].min
end

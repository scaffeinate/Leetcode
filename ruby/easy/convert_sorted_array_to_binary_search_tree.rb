# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {Integer[]} nums
# @return {TreeNode}
def sorted_array_to_bst(nums)
    return construct_bst(nums, 0, nums.length-1)
end

def construct_bst(nums, start, stop)
    return nil if start > stop
    middle = ((start + stop)/2).to_i
    root = TreeNode.new(nums[middle])
    root.left = construct_bst(nums, start, middle-1)
    root.right = construct_bst(nums, middle+1, stop)
    return root
end

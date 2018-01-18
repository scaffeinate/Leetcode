# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @param {Integer} k
# @return {Boolean}
def find_target(root, k)
    set = Set.new
    return target_exists?(root, k, set)
end

def target_exists?(root, k, set)
    return false unless root
    return true if set.include?(k - root.val)
    set.add(root.val)
    return target_exists?(root.left, k, set) || target_exists?(root.right, k, set)
end

# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @param {Float} target
# @return {Integer}
def closest_value(root, target)
    return 0 unless root
    min, min_root = (root.val - target).abs, root
    while(root)
        delta = root.val - target
        if(delta.abs < min)
            min = delta.abs
            min_root = root
        end
        root = (delta > 0) ? root.left : root.right
    end
    return min_root.val
end

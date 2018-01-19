# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @param {Integer} l
# @param {Integer} r
# @return {TreeNode}
def trim_bst(root, l, r)
    return nil unless root
    while(root && !(root.val >= l && root.val <= r))
        if(root.val < l)
            root = root.right
        else
            root = root.left
        end
    end
    if(root)
        root.left = trim_bst(root.left, l, r)
        root.right = trim_bst(root.right, l, r)
    end
    return root
end


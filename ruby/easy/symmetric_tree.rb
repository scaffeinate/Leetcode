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
def is_symmetric(root)
    return check_symmetric(root, root)
end

def check_symmetric(root, root2)
    return (root.nil? && root2.nil?) if root.nil? || root2.nil?
    return root.val == root2.val && check_symmetric(root.left, root2.right) && check_symmetric(root.right, root2.left)
end

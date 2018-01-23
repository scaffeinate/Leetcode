# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @param {TreeNode} p
# @return {TreeNode}
def inorder_successor(root, p)
    res = {}
    find_inorder_successor(root, p, res)
    return res ? res[:successor] : nil
end

def find_inorder_successor(root, p, res)
    return unless root
    if(root == p)
        root = root.right
        while(root && root.left)
            root = root.left
        end
        res[:successor] = root
    elsif(p.val < root.val)
        find_inorder_successor(root.left, p, res)
        res[:successor] = root unless res[:successor]
    else
        find_inorder_successor(root.right, p ,res)
    end
end

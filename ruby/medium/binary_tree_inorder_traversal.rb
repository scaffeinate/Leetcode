
# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @return {Integer[]}
def inorder_traversal(root)
    stack = Array.new
    res = Array.new
    go_left(stack, root)
    while stack.length > 0
        top = stack.pop
        res.push(top.val)
        go_left(stack, top.right)
    end
    return res
end

def go_left(stack, node)
    while(node)
        stack.push(node)
        node = node.left
    end
end

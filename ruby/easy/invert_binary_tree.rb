# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @return {TreeNode}
def invert_tree(root)
    queue = Array.new
    queue.push(root) if root
    while(!queue.empty?)
        current = queue.shift
        swap_children(current)
        queue.push(current.left) if current.left
        queue.push(current.right) if current.right
    end
    return root
end

def swap_children(current)
    temp = current.left
    current.left = current.right
    current.right = temp
end
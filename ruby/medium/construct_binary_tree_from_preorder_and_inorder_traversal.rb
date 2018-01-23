# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {Integer[]} preorder
# @param {Integer[]} inorder
# @return {TreeNode}
def build_tree(preorder, inorder)
    map = {}
    root = nil
    inorder.each_with_index do |n, i|
        map[n] = i
    end
    
    preorder.each do |n|
        root = insert(root, n, map)
    end
    return root
end

def insert(root, n, map)
    return TreeNode.new(n) if root.nil?
    index = map[n]
    root_index = map[root.val]
    if(index < root_index)
        root.left = insert(root.left, n, map)
    else
        root.right = insert(root.right, n, map)
    end
    return root
end

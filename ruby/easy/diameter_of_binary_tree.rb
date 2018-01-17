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
def diameter_of_binary_tree(root)
    return find_diameter(root)[:diameter]
end

def find_diameter(root)
    return { diameter: 0, depth: 0 } unless root
    left = find_diameter(root.left)
    right = find_diameter(root.right)
    return { diameter: [left[:diameter], right[:diameter], (left[:depth] + right[:depth])].max, 
                depth: [left[:depth], right[:depth]].max + 1 };
end

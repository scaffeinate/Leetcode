# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @return {String[]}
def binary_tree_paths(root)
    results = Array.new
    dfs(root, Array.new, results)
    return results
end

def dfs(root, temp, results)
    return unless root
    if root.left.nil? && root.right.nil?
        str = ""
        temp.each do |i|
            str += i.to_s + "->"
        end
        results.push(str + root.val.to_s)
    else
        temp.push(root.val)
        dfs(root.left, temp, results)
        dfs(root.right, temp, results)
        temp.pop
    end
end

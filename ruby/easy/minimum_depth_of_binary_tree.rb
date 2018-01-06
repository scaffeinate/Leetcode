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
def min_depth(root)
    return 0 unless root
    queue = []
    queue.unshift([root, 0])
    while(!queue.empty?)
        current = queue.pop()
        return current[1]+1 if current[0].left.nil? && current[0].right.nil?
        queue.unshift([current[0].left, current[1]+1]) if current[0].left
        queue.unshift([current[0].right, current[1]+1]) if current[0].right
    end
end

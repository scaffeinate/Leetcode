# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @param {Integer} sum
# @return {Boolean}
def has_path_sum(root, sum)
    return false unless root
    queue = []
    queue.unshift({ node: root, sum: 0 })
    while(!queue.empty?)
        current = queue.pop()
        node = current[:node]
        running = (node.val + current[:sum])
        return true if (running == sum) && (node.left.nil? && node.right.nil?)
        queue.unshift({ node: node.left, sum: running }) if node.left
        queue.unshift({ node: node.right, sum: running }) if node.right
    end
    return false
end

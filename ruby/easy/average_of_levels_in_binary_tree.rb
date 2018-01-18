# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @return {Float[]}
def average_of_levels(root)
    res = Array.new
    queue = Array.new
    queue.push(root) if root
    i, sum, num_nodes_in_level = 0, 0, queue.length
    while !queue.empty?
        current = queue.shift
        sum += current.val
        i += 1
        queue.push(current.left) if current.left
        queue.push(current.right) if current.right
        if i == num_nodes_in_level
            res.push((sum.to_f/num_nodes_in_level))
            num_nodes_in_level = queue.length
            i = sum = 0
        end
    end
    return res
end

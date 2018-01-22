# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @return {Integer[][]}
def zigzag_level_order(root)
    queue = Array.new
    res, temp = Array.new, Array.new
    queue.push(root) if root
    current_nodes, num_nodes_in_level, level = 0, queue.length, 0
    while !queue.empty?
        current = queue.shift
        if((level % 2) == 0)
            temp.push(current.val)
        else
            temp.unshift(current.val)
        end
        current_nodes += 1
        queue.push(current.left) if current.left
        queue.push(current.right) if current.right
        if current_nodes == num_nodes_in_level
            res.push(temp)
            temp = Array.new
            num_nodes_in_level = queue.length
            current_nodes = 0
            level += 1
        end
    end
    return res
end

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
def level_order_bottom(root)
    return [] unless root
    queue, result, level = [], [], []
    num_nodes, current_count = 1, 0
    queue.unshift(root)
    while(!queue.empty?)
        current = queue.pop()
        current_count += 1
        level.push(current.val)

        queue.unshift(current.left) if current.left
        queue.unshift(current.right) if current.right

        if(current_count == num_nodes)
            result.unshift(level)
            level = []
            current_count = 0
            num_nodes = queue.length
        end
    end
    return result
end

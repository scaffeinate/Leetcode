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
# @return {Integer}
def path_sum(root, sum)
    return count_paths(root, sum, 0, Hash.new)
end

def count_paths(root, sum, running_sum, map)
    return 0 unless root
    running_sum += root.val
    count = (running_sum == sum) ? 1 : 0
    count += map[running_sum - sum] if map[running_sum - sum]
    map[running_sum] = map[running_sum] ? map[running_sum]+1 : 1
    count += count_paths(root.left, sum, running_sum, map) + count_paths(root.right, sum, running_sum, map)
    if map[running_sum] == 1
        map.delete(running_sum)
    else
        map[running_sum] = map[running_sum] - 1
    end
    return count
end

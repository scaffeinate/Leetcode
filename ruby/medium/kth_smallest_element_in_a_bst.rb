# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @param {Integer} k
# @return {Integer}
def kth_smallest(root, k)
    counter_map = {}
    count_nodes(root, counter_map)
    return find_kth(root, 0, k, counter_map).val
end

def find_kth(root, i, k, counter_map)
    return nil unless root
    count = counter_map[root]
    n = (i + count[:left] + 1)
    if n == k
        return root
    elsif k < n
        return find_kth(root.left, i, k, counter_map)
    else
        return find_kth(root.right, n, k, counter_map)
    end
end

def count_nodes(root, counter_map)
    return 0 unless root
    left = count_nodes(root.left, counter_map)
    right = count_nodes(root.right, counter_map)
    counter_map[root] = { left: left, right: right }
    return 1 + left + right
end

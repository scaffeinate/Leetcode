# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} t1
# @param {TreeNode} t2
# @return {TreeNode}
def merge_trees(t1, t2)
    return nil if t1.nil? && t2.nil?
    sum = (t1.nil? ? 0 : t1.val) + (t2.nil? ? 0 : t2.val)
    res = TreeNode.new(sum)
    res.left = merge_trees((t1 ? t1.left : nil), (t2 ? t2.left : nil))
    res.right = merge_trees((t1 ? t1.right : nil), (t2 ? t2.right : nil))
    return res
end

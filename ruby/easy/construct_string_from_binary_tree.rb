# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} t
# @return {String}
def tree2str(t)
    return "" unless t
    str = t.val.to_s
    left = tree2str(t.left)
    right = tree2str(t.right)
    if(!left.empty? && !right.empty?)
        str += "(#{left})(#{right})"
    elsif(!left.empty? && right.empty?)
        str += "(#{left})"
    elsif(left.empty? && !right.empty?)
        str += "()(#{right})"
    end
    return str
end

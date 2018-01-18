/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public String tree2str(TreeNode t) {
        if(t == null) return "";
        StringBuilder builder = new StringBuilder();
        builder.append(t.val);
        if(t.left != null || t.right != null) {
            builder.append("(").append(tree2str(t.left)).append(")");
            String right = tree2str(t.right);
            if(!right.equals("")) {
                builder.append("(").append(right).append(")");
            }
        }
        
        return builder.toString();
    }
}

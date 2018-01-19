/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null || t == null) return false;
        if(s.val == t.val && compare(s, t)) return true; 
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    private boolean compare(TreeNode s, TreeNode t) {
        if(s == null || t == null) { return (s == null && t == null); }
        if(s.val != t.val) return false;
        return compare(s.left, t.left) && compare(s.right, t.right);
    }
}

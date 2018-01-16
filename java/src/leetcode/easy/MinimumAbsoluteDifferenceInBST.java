/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getMinimumDifference(TreeNode root) {
        Wrapper w = new Wrapper();
        getMinimum(root, w);
        return w.min;
    }
    
    private void getMinimum(TreeNode root, Wrapper w) {
        if(root == null) return;
        getMinimum(root.left, w);
        w.min = Math.min(w.min, (w.prev == null ? Integer.MAX_VALUE : (root.val - w.prev.val)));
        w.prev = root;
        getMinimum(root.right, w);
    }
    
    class Wrapper {
        int min = Integer.MAX_VALUE;
        TreeNode prev = null;
    }
}

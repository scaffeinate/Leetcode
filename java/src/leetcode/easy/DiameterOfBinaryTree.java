/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        Wrapper w = new Wrapper();
        diameterOfBinaryTree(root, w);
        return w.len;
    }
    
    private int diameterOfBinaryTree(TreeNode root, Wrapper w) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int left = diameterOfBinaryTree(root.left, w);
        int right = diameterOfBinaryTree(root.right, w);
        
        if(w.len < (left + right)) {
            w.len = left + right;
        }
        
        return Math.max(left, right) + 1;
    }
    
    class Wrapper {
        int len = 0;
    }
}

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
    public int findTilt(TreeNode root) {
        Wrapper w = new Wrapper();
        findTilt(root, w);
        return w.tilt;
    }
    
    private int findTilt(TreeNode root, Wrapper w) {
        if(root == null) return 0;
        int leftSum = findTilt(root.left, w);
        int rightSum = findTilt(root.right, w); 
        w.tilt += Math.abs(leftSum - rightSum);
        return root.val + leftSum + rightSum;
    }
    
    static class Wrapper {
        int tilt = 0;
    }
}

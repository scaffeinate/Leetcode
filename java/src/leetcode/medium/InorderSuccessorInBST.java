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
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null) return null;
        if(root == p) {
            TreeNode temp = null;
            if(root.right != null) {
                temp = root.right;
                while(temp.left != null) { temp = temp.left; }
            }
            return temp;
        } else if(root.val > p.val) {
            TreeNode res = inorderSuccessor(root.left, p);
            return (res == null) ? root : res;
        } else {
            return inorderSuccessor(root.right, p);
        }
    }
}

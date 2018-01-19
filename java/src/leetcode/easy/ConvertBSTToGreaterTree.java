/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class ConvertBSTToGreaterTree {
    public TreeNode convertBST(TreeNode root) {
        convertBST(root, new Wrapper());
        return root;
    }
    
    private void convertBST(TreeNode root, Wrapper w) {
        if(root == null) return;
        convertBST(root.right, w);
        int temp = root.val;
        root.val += w.sum;
        w.sum += temp;
        convertBST(root.left, w);
    }
    
    static class Wrapper {
        int sum = 0;
    }
}

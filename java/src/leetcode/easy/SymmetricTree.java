package leetcode.easy;

import common.TreeNode;

/**
 * Question: https://leetcode.com/problems/symmetric-tree/description/
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode root, TreeNode root2) {
        if (root == null || root2 == null) return root == null ? (root2 == null) : (root == null);
        return (root.val == root2.val) && isSymmetric(root.left, root2.right) && isSymmetric(root.right, root2.left);
    }
}

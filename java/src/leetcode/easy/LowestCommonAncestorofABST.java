package leetcode.easy;

import common.TreeNode;

/**
 * Question: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
 */
public class LowestCommonAncestorofABST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}

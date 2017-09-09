package leetcode.easy;

import common.TreeNode;

/**
 * Question: https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return 1 + Math.min(left == 0 ? Integer.MAX_VALUE : left, right == 0 ? Integer.MAX_VALUE : right);
    }
}

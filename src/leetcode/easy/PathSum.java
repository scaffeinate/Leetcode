package leetcode.easy;

import common.TreeNode;

/**
 * Question: https://leetcode.com/problems/path-sum/description/
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        return hasPathSum(root, 0, sum);
    }

    private boolean hasPathSum(TreeNode root, int running, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return ((running + root.val) == sum);
        }
        running += root.val;
        return hasPathSum(root.left, running, sum) || hasPathSum(root.right, running, sum);
    }
}

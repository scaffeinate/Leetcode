package leetcode.easy;

import common.TreeNode;

/**
 * Question: https://leetcode.com/problems/sum-of-left-leaves/description/
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }

    private int sumOfLeftLeaves(TreeNode root, boolean left) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) {
            return left ? root.val : 0;
        }

        return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
    }
}

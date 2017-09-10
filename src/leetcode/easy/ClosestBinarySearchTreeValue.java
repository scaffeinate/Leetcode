package leetcode.easy;

import common.TreeNode;

/**
 * Question: https://leetcode.com/problems/closest-binary-search-tree-value/description/
 */
public class ClosestBinarySearchTreeValue {
    public int closestValue(TreeNode root, double target) {
        Wrapper w = new Wrapper();
        closestValue(root, target, w);
        return w.val;
    }

    private void closestValue(TreeNode root, double target, Wrapper w) {
        if (root == null) return;
        double diff = Math.abs((double) root.val - target);
        if (diff < w.closest) {
            w.closest = diff;
            w.val = root.val;
        }
        if (root.val > target) {
            closestValue(root.left, target, w);
        } else {
            closestValue(root.right, target, w);
        }
    }

    static class Wrapper {
        int val = 0;
        double closest = Double.MAX_VALUE;
    }
}

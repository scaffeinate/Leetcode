package leetcode.easy;


import common.TreeNode;

/**
 * Question: https://leetcode.com/problems/same-tree/description/
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null) return (q == null);
        if (q == null) return (p == null);
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right) && p.val == q.val;
    }
}

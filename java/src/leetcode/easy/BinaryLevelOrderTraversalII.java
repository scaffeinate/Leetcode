package leetcode.easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Question: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 */
public class BinaryLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> level = new ArrayList<Integer>();
        queue.offer(root);
        int levelNodes = 1, num = 0;
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            level.add(current.val);
            num++;
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);

            if (num == levelNodes) {
                result.addFirst(level);
                levelNodes = queue.size();
                num = 0;
                level = new ArrayList<Integer>();
            }
        }

        return result;
    }
}

package leetcode.easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Question: https://leetcode.com/problems/binary-tree-paths/description/
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> results = new ArrayList<String>();
        dfs(root, new Stack<Integer>(), results);
        return results;
    }

    private void dfs(TreeNode root, Stack<Integer> stack, List<String> results) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < stack.size(); i++) {
                builder.append(stack.get(i)).append("->");
            }
            results.add(builder.append(root.val).toString());
        } else {
            stack.push(root.val);
            dfs(root.left, stack, results);
            dfs(root.right, stack, results);
            stack.pop();
        }
    }
}

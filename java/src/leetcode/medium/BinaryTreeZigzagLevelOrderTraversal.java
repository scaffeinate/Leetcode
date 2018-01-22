/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        dfs(root, 0, results);
        return results;
    }
    
    private void dfs(TreeNode root, int level, List<List<Integer>> results) {
        if(root == null) return;
        LinkedList<Integer> list = null;
        if (level < results.size()) {
            list = (LinkedList<Integer>) results.get(level);
        } else {
            list = new LinkedList<Integer>();
            results.add(list);
        }
        
        if(level % 2 == 0) {
            list.add(root.val);
        } else {
            list.addFirst(root.val);
        }
        
        dfs(root.left, level + 1, results);
        dfs(root.right, level + 1, results);
    }
}

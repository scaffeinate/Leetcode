/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<Double>();
        if(root == null) { return result; }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int numNodesInLevel = queue.size(), count = 0;
        double sum = 0;
        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();
            sum += (current.val); count++;
            if(current.left != null) queue.offer(current.left);

            if(current.right != null) queue.offer(current.right);

            if(count == numNodesInLevel) {
                result.add(sum/count);
                numNodesInLevel = queue.size();
                count = 0; sum = 0;
            }
        }

        return result;
    }
}

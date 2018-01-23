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
    public int kthSmallest(TreeNode root, int k) {
        Map<TreeNode, int[]> counterMap = new HashMap<>();
        countNodes(root, counterMap);
        return findKthSmallest(root, counterMap, k);
    }
    
    private int findKthSmallest(TreeNode root, Map<TreeNode, int[]> counterMap, int k) {
        if(root == null) return 0;
        int[] count = counterMap.get(root);
        int n = (1 + count[0]);
        if(n == k) {
            return root.val;
        } else if(k < n) {
            return findKthSmallest(root.left, counterMap, k);
        } else {
            return findKthSmallest(root.right, counterMap, (k - n));
        }
    }
    
    private int countNodes(TreeNode root, Map<TreeNode, int[]> counterMap) {
        if(root == null) return 0;
        int left = countNodes(root.left, counterMap);
        int right = countNodes(root.right, counterMap);
        counterMap.put(root, new int[] { left, right });
        return 1 + left + right;
    }
}

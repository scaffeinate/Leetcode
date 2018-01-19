/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SecondMinimumNodeInABinaryTree {
    public int findSecondMinimumValue(TreeNode root) {
        int min = root.val;
        int secondMin = findSecondMinimumValue(root, min);
        return (secondMin == Integer.MAX_VALUE) ? -1 : secondMin;
    }
    
    private int findSecondMinimumValue(TreeNode root, int min) {
        if(root == null) return Integer.MAX_VALUE;
        int secondMin = (root.val > min) ? root.val : Integer.MAX_VALUE;
        return Math.min(secondMin, 
                        Math.min(findSecondMinimumValue(root.left, min), 
                                            findSecondMinimumValue(root.right, min)));
    }
}

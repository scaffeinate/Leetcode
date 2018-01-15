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
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return numPaths(root, sum, 0, new HashMap<Integer, Integer>());
    }
    
    private int numPaths(TreeNode root, int targetSum, int runningSum, Map<Integer, Integer> sumMap) {
        if(root == null) {
            return 0;
        }
        
        int counter = 0;
        runningSum += root.val;
        
        if(runningSum == targetSum) { 
            counter += 1;
        } 
        
        if(sumMap.containsKey(runningSum - targetSum)) {
            counter += sumMap.get(runningSum - targetSum);
        }
        
        sumMap.put(runningSum, sumMap.getOrDefault(runningSum, 0) + 1);
        
        counter += numPaths(root.left, targetSum, runningSum, sumMap);
        counter += numPaths(root.right, targetSum, runningSum, sumMap);
        
        sumMap.put(runningSum, sumMap.get(runningSum) - 1);
        
        return counter;
    }
}

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> indexesMap = new HashMap<>();
        TreeNode root = null;
        for(int i = 0; i < inorder.length; i++) {
            indexesMap.put(inorder[i], i);
        }
        
        for(int i = 0; i < preorder.length; i++) {
            root = insert(root, preorder[i], indexesMap);
        }
        
        return root;
    }
    
    private TreeNode insert(TreeNode root, int num, Map<Integer, Integer> indexesMap) {
        if(root == null) {
            root = new TreeNode(num);
        } else {
            if(indexesMap.get(num) < indexesMap.get(root.val)) {
                root.left = insert(root.left, num, indexesMap);
            } else {
                root.right = insert(root.right, num, indexesMap);
            }
        }
        return root;
    }
}

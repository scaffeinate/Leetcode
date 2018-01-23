/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        connectSiblings(root);
        connectCousins(root);
    }
    
    private void connectSiblings(TreeLinkNode root) {
        if(root == null) return;
        if(root.left != null && root.right != null) {
            root.left.next = root.right;
        }
        connectSiblings(root.left);
        connectSiblings(root.right);
    }
    
    private void connectCousins(TreeLinkNode root) {
        if(root == null) return;
        TreeLinkNode current = root;
        while(current != null) {
            if(current.right != null && current.next != null && current.next.left != null) {
                current.right.next = current.next.left;
            }
            current = current.next;
        }
        connectCousins(root.left);
    }
}

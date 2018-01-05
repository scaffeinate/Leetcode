package leetcode.easy;

import common.ListNode;

/**
 * Question: https://leetcode.com/problems/delete-node-in-a-linked-list/description/
 */
public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}

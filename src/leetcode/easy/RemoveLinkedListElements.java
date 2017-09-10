package leetcode.easy;

import common.ListNode;

/**
 * Question: https://leetcode.com/problems/remove-linked-list-elements/description/
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head != null) {
            ListNode current = head, runner = current.next;
            while (runner != null) {
                if (runner.val == val) {
                    current.next = runner.next;
                } else {
                    current = current.next;
                }
                runner = runner.next;
            }
        }
        return head;
    }
}

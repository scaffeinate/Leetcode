package leetcode.easy;

import common.ListNode;

/**
 * Question: https://leetcode.com/problems/reverse-linked-list/description/
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode runner = head.next;
        ListNode temp;
        head.next = null;
        while (runner != null) {
            temp = runner.next;
            runner.next = head;
            head = runner;
            runner = temp;
        }

        return head;
    }
}

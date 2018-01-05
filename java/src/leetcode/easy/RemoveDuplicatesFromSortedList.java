package leetcode.easy;

import common.ListNode;

/**
 * Question: https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode current = head;
        while (current != null) {
            ListNode runner = current.next;
            while (runner != null && runner.val == current.val) {
                runner = runner.next;
            }
            current.next = runner;
            current = current.next;
        }

        return head;
    }
}

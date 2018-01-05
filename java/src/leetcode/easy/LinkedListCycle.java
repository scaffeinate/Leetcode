package leetcode.easy;

import common.ListNode;

/**
 * Question: https://leetcode.com/problems/linked-list-cycle/description/
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode current = head, fast = head;
        while (fast != null && fast.next != null) {
            current = current.next;
            fast = fast.next.next;
            if (current.equals(fast)) {
                return true;
            }
        }
        return false;
    }
}

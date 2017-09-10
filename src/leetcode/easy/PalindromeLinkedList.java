package leetcode.easy;

import common.ListNode;

/**
 * Question: https://leetcode.com/problems/palindrome-linked-list/description/
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode current = head, runner = head, center = null, temp = null;
        while (runner != null && runner.next != null) {
            current = current.next;
            runner = runner.next.next;
        }

        center = current;
        runner = current.next;
        while (runner != null) {
            temp = runner.next;
            runner.next = current;
            current = runner;
            runner = temp;
        }

        runner = current;
        current = head;
        while (current != center) {
            if (current.val != runner.val) {
                return false;
            }
            current = current.next;
            runner = runner.next;
        }

        return true;
    }
}

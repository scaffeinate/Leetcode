package leetcode.easy;

import common.ListNode;

/**
 * Question: https://leetcode.com/problems/intersection-of-two-linked-lists/description/
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA, currentB = headB;
        int i = 0, countA = 0, countB = 0;
        while (currentA != null) {
            currentA = currentA.next;
            countA++;
        }
        while (currentB != null) {
            currentB = currentB.next;
            countB++;
        }
        if (countA > countB) {
            while (headA != null && i < (countA - countB)) {
                headA = headA.next;
                i++;
            }
        } else if (countB > countA) {
            while (headB != null && i < (countB - countA)) {
                headB = headB.next;
                i++;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}

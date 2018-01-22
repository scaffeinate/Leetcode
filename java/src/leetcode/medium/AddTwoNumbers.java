/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList list = new LinkedList();
        while(l1 != null || l2 != null) {
            if(l1 != null && l2 != null) {
                list.insert(l1.val + l2.val);
                l1 = l1.next;
                l2 = l2.next;
            } else if(l1 != null) {
                list.insert(l1.val);
                l1 = l1.next;
            } else {
                list.insert(l2.val);
                l2 = l2.next;
            }
        }
        
        if(list.carry > 0) {
            list.insert(0);
        }
        return list.head;
    }
    
    class LinkedList {
        private ListNode head = null, tail = null;
        private int carry = 0;
        
        private void insert(int value) {
            int sum = value + this.carry;
            this.carry = sum/10;
            ListNode node = new ListNode(sum % 10);
            if(head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
    }
}

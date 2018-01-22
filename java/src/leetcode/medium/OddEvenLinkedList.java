/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode[] oddList = new ListNode[2];
        ListNode[] evenList = new ListNode[2];
        ListNode current = head, runner = head.next;
        while(runner != null && runner.next != null) {
            insert(current, oddList);
            insert(runner, evenList);
            current = current.next.next;
            runner = runner.next.next;
        }
        insert(current, oddList);
        insert(runner, evenList);
        oddList[1].next = evenList[0];
        return oddList[0];
    }
    
    private void insert(ListNode node, ListNode[] list) {
        if(list[0] == null) {
            list[0] = list[1] = node;
        } else {
            list[1].next = node;
            list[1] = node;
        }
    }
}

/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
    if(head == null) return null;
    let current = head, runner = head.next, temp = null;
    head.next = null;
    while(runner != null) {
        temp = runner.next;
        runner.next = current;
        current = runner;
        runner = temp;
    }
    return current;
};
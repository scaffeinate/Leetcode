/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} val
 * @return {ListNode}
 */
var removeElements = function(head, val) {
    while(head != null && head.val == val) {
        head = head.next;
    }
    if(head == null) return null;
    
    let current = head, runner = head.next;
    while(runner != null) {
        if(runner.val === val) {
            current.next = runner.next;
        } else {
            current = current.next;
        }
        runner = runner.next;
    }
    
    return head;
};
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
var deleteDuplicates = function(head) {
    if(head == null) return null;
    let current = head, runner = head.next;
    while(runner !== null) {
        if(current.val != runner.val) {
            current.next = runner;
            current = runner;
        }
        runner = runner.next;
    }
    current.next = null;
    return head;
};

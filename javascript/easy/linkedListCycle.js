/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
    let current = head, runner = head;
    while(runner != null && runner.next != null) {
        current = current.next;
        runner = runner.next.next;
        if(current == runner) {
            return true;
        }
    }
    return false;
};

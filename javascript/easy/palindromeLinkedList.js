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
var isPalindrome = function(head) {
    return checkPalindrome(head, head, { node: undefined });
};

var checkPalindrome = function(current, runner, obj) {
    if(runner === null || runner.next === null) {
        obj.node = (runner === null) ? current : current.next;
        return true;
    }
    let isPalindrome = checkPalindrome(current.next, runner.next.next, obj) && (current.val === obj.node.val);
    obj.node = obj.node.next;
    return isPalindrome;
}
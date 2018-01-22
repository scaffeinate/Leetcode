/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    const res = { head: null, tail: null, carry: 0 };
    while(l1 !== null || l2 !== null) {
        if(l1 !== null && l2 !== null) {
            insert(res, (l1.val + l2.val));
            l1 = l1.next;
            l2 = l2.next;
        } else if(l1 !== null) {
            insert(res, l1.val);
            l1 = l1.next;
        } else {
            insert(res, l2.val);
            l2 = l2.next;
        }
    }
    
    if(res.carry > 0) {
        insert(res, 0);
    }
    return res.head;
};

var insert = function(res, sum) {
    sum = sum + res.carry;
    const node = new ListNode(sum%10);
    res.carry = parseInt(sum/10);
    if(res.head === null) {
        res.head = res.tail = node;
    } else {
        res.tail.next = node;
        res.tail = node;
    }
}

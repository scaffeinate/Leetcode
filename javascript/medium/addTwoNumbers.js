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
    let sum = 0;
    let obj = { head: undefined, tail: undefined, carry: 0 };
    while(l1 != undefined && l2 != undefined) {
        addToList(obj, (l1.val + l2.val));
        l1 = l1.next; l2 = l2.next;
    }
    
    while(l1 != undefined) {
        addToList(obj, l1.val);
        l1 = l1.next;
    }
    
    while(l2 != undefined) {
        addToList(obj, l2.val);
        l2 = l2.next;
    }
    
    if(obj.carry > 0) {
        addToList(obj, 0);
    }
    
    return obj.head;
};

var addToList = function(obj, val) {
    let sum = val + obj.carry;
    let node = new ListNode(sum % 10);
    obj.carry = parseInt(sum/10);
    if(obj.head == undefined) {
        obj.head = obj.tail = node;
    } else {
        obj.tail.next = node;
        obj.tail = node;
    }
}
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
var mergeTwoLists = function(l1, l2) {
    let obj = { head: null, tail: null };
    while(l1 !== null && l2 !== null) {
        if(l1.val < l2.val) {
            add(l1, obj);
            l1 = l1.next;    
        } else {
            add(l2, obj);
            l2 = l2.next;    
        }
    }
    
    if(l1 != null) {
        add(l1, obj);
    }
    
    if(l2 != null) {
        add(l2, obj);
    }
    
    return obj.head;
};

var add = function(l, obj) {
    if(obj.head == null) {
        obj.head = obj.tail = l;
    } else {
        obj.tail.next = l;
        obj.tail = l;
    }
};
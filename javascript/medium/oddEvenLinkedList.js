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
var oddEvenList = function(head) {
    if(head === null) return null;
    const oddList = {head: null, tail: null}, evenList = {head: null, tail: null};
    let odd = head, even = head.next;
    insert(odd, oddList);
    insert(even, evenList);
    
    while(even !== null && even.next !== null) {
        odd = odd.next.next;
        even = even.next.next;
        insert(odd, oddList);
        insert(even, evenList);
    }
    oddList.tail.next = evenList.head;
    return oddList.head;
};

var insert = function(node, listObj) {
    if(listObj.head === null) {
        listObj.head = listObj.tail = node;
    } else {
        listObj.tail.next = node;
        listObj.tail = node;
    }
};

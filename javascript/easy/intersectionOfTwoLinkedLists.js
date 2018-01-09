/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function(headA, headB) {
    let currentA = headA, currentB = headB, sizeA = getSize(headA), sizeB = getSize(headB);
    if(sizeA > sizeB) {
        currentA = moveNode(currentA, (sizeA - sizeB));
    } else {
        currentB = moveNode(currentB, (sizeB - sizeA));
    }

    while(currentA != null && currentB != null) {
        if(currentA == currentB) {
            return currentA;
        }
        currentA = currentA.next;
        currentB = currentB.next;
    }

    return null;
};

var getSize = function(head) {
    let size = 0;
    while(head != null) {
        head = head.next;
        size++;
    }
    return size;
};

var moveNode = function(head, number) {
    let i = 0;
    while(head != null && i < number) {
        head = head.next;
        i++;
    }
    return head;
};

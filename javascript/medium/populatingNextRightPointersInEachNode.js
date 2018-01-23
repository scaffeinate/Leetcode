/**
 * Definition for binary tree with next pointer.
 * function TreeLinkNode(val) {
 *     this.val = val;
 *     this.left = this.right = this.next = null;
 * }
 */

/**
 * @param {TreeLinkNode} root
 * @return {void} Do not return anything, modify tree in-place instead.
 */
var connect = function(root) {
    connectSiblings(root);
    connectCousins(root);
};

var connectSiblings = function(root) {
    if(root === null) return;
    if(root.left !== null && root.right !== null) {
        root.left.next = root.right;
    }
    connectSiblings(root.left);
    connectSiblings(root.right);
};

var connectCousins = function(root) {
    if(root === null) return;
    let current = root;
    while(current) {
        if(current.right !== null && 
            current.next !== null && current.next.left !== null) {
            current.right.next = current.next.left;
        }
        current = current.next;
    }
    connectCousins(root.left);
};

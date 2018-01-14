/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var sumOfLeftLeaves = function(root) {
    let queue = new Array(), sum = 0;
    if(root !== null) {
        queue.push(root);
    }
    while(queue.length > 0) {
        let current = queue.shift();
        if(current.left !== null) {
            if(current.left.left === null && current.left.right === null) {
                sum += current.left.val;
            }
            queue.push(current.left);
        }
        if(current.right !== null) {
            queue.push(current.right);
        }
    }
    return sum;
};

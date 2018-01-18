/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var averageOfLevels = function(root) {
    const queue = new Array(), res = new Array();
    if(root !== null) {
        queue.push(root);
    }
    let currentCount = 0, sum = 0, numNodesInLevel = queue.length;
    while(queue.length > 0) {
        const current = queue.shift();
        sum += current.val;
        currentCount++;
        if(current.left !== null) {
            queue.push(current.left);
        }
        if(current.right !== null) {
            queue.push(current.right);
        }
        if(currentCount === numNodesInLevel) {
            res.push(sum/numNodesInLevel);
            sum = currentCount = 0;
            numNodesInLevel = queue.length;
        }
    }
    return res;
};

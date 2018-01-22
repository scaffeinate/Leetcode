/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
var zigzagLevelOrder = function(root) {
    const res = new Array(), queue = new Array();
    if(root === null) {
        return res;
    }
    queue.push(root);
    let numNodesInLevel = queue.length, currentCount = 0, level = 0, levelNodes = new Array();
    while(queue.length > 0) {
        let current = queue.shift();
        if((level % 2) === 0) {
            levelNodes.push(current.val);    
        } else {
            levelNodes.unshift(current.val);
        }
        currentCount++;
        if(current.left !== null) { queue.push(current.left); }
        if(current.right !== null) { queue.push(current.right); }
        
        if(currentCount === numNodesInLevel) {
            res.push(levelNodes);
            levelNodes = new Array();
            numNodesInLevel = queue.length;
            currentCount = 0;
            level++;
        }
    }
    
    return res;
};

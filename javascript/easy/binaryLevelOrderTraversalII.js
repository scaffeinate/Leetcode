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
var levelOrderBottom = function(root) {
    if(root == null) return [];
    let queue = [], res = [], level = [], numNodesInLevel = 0, currentNodes = 0;
    queue.unshift(root);
    numNodesInLevel = queue.length;
    while(queue.length > 0) {
        let current = queue.pop();
        currentNodes++;
        level.push(current.val);

        if(current.left != null) {
            queue.unshift(current.left);
        }

        if(current.right != null) {
            queue.unshift(current.right);
        }

        if(currentNodes == numNodesInLevel) {
            res.unshift(level);
            level = [];
            numNodesInLevel = queue.length;
            currentNodes = 0;
        }
    }
    return res;
};

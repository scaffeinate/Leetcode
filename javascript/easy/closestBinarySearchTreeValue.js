/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} target
 * @return {number}
 */
var closestValue = function(root, target) {
    return findClosest(root, target)[0].val;
};

var findClosest = function(root, target) {
    if(root == null) return [null, Number.MAX_SAFE_INTEGER];
    let delta = (root.val - target), nextNode = (delta > 0) ? root.left : root.right;
    let res = findClosest(nextNode, target);
    return (Math.abs(delta) < res[1]) ? [root, Math.abs(delta)] : res;
};

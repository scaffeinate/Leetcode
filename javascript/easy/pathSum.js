/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} sum
 * @return {boolean}
 */
var hasPathSum = function(root, sum) {
    return pathSum(root, 0, sum);
};

var pathSum = function(root, running, sum) {
    if(root == null) {
        return false;
    } else if(root.left == null && root.right == null) {
        return ((running + root.val) == sum);
    } else {
        return pathSum(root.left, (running + root.val), sum) || pathSum(root.right, (running + root.val), sum);
    }
};

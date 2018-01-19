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
var findSecondMinimumValue = function(root) {
    const min = root.val;
    const secondMin = findSecondMin(root, min);
    return (secondMin === Number.MAX_SAFE_INTEGER) ? -1 : secondMin;
};

var findSecondMin = function(root, min) {
    if(root === null) return Number.MAX_SAFE_INTEGER;
    let secondMin = (root.val > min) ? root.val : Number.MAX_SAFE_INTEGER;
    return Math.min(secondMin, findSecondMin(root.left, min), findSecondMin(root.right, min));
};

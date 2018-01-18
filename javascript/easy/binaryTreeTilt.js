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
var findTilt = function(root) {
    return findTreeTilt(root).tilt;
};

var findTreeTilt = function(root) {
    if(root === null) return { tilt: 0, sum: 0 };
    const left = findTreeTilt(root.left);
    const right = findTreeTilt(root.right);
    const tilt = left.tilt + right.tilt + Math.abs(left.sum - right.sum);
    const sum = left.sum + right.sum + root.val;
    return { tilt: tilt, sum: sum };
};

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
var diameterOfBinaryTree = function(root) {
    return findDiameter(root).diameter;
};

var findDiameter = function(root) {
    if(root === null) return { diameter: 0, depth: 0 };
    const left = findDiameter(root.left);
    const right = findDiameter(root.right);
    const depth = Math.max(left.depth, right.depth) + 1;
    const diameter = Math.max(left.diameter, right.diameter, (left.depth+right.depth));
    return { diameter: diameter, depth: depth };
};

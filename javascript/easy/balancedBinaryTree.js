/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isBalanced = function(root) {
    return checkBalanced(root).balanced;
};

var checkBalanced = function(root) {
    if(root == null) return { depth: 0, balanced: true };
    let leftObj = checkBalanced(root.left);
    let rightObj = checkBalanced(root.right);
    let isBalanced = leftObj.balanced && rightObj.balanced && Math.abs(leftObj.depth - rightObj.depth) <= 1;
    return { depth: Math.max(leftObj.depth, rightObj.depth)+1, balanced: isBalanced };
};

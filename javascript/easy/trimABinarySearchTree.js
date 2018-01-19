/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} L
 * @param {number} R
 * @return {TreeNode}
 */
var trimBST = function(root, L, R) {
    if(root === null) return null;
    root = validRoot(root, L, R);
    if(root !== null) {
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
    }
    return root;
};

var validRoot = function(root, L, R) {
    if(root === null) return null;
    if(root.val >= L && root.val <= R) {
        return root;
    } else if(root.val < L) {
        return validRoot(root.right, L, R);
    } else {
        return validRoot(root.left, L, R);
    }
};

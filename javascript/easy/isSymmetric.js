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
var isSymmetric = function(root) {
    return checkSymmmetric(root, root);
};

var checkSymmmetric = function(root1, root2) {
    if(root1 == null || root2 == null) {
        return (root1 == null && root2 == null);
    }

    return (root1.val == root2.val) && checkSymmmetric(root1.left, root2.right) && checkSymmmetric(root1.right, root2.left);
};

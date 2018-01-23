/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {TreeNode} p
 * @return {TreeNode}
 */
var inorderSuccessor = function(root, p) {
    const res = {};
    findInOrderSuccessor(root, p, res);
    return res.successor;
};

var findInOrderSuccessor = function(root, p, res) {
    if(root === null) return;
    if(root === p) {
        root = root.right;
        while(root !== null && root.left !== null) {
            root = root.left;
        }
        res.successor = root;
    } else if(p.val < root.val) {
        findInOrderSuccessor(root.left, p, res);
        if(res.successor === null) {
            res.successor = root;
        }
    } else {
        findInOrderSuccessor(root.right, p, res);
    }
};

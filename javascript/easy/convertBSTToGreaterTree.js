/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var convertBST = function(root) {
    convertToHigherTree(root, {sum: 0});
    return root;
};

var convertToHigherTree = function(root, obj) {
    if(root === null) return;
    convertToHigherTree(root.right, obj);
    obj.sum += root.val;
    root.val = obj.sum;
    convertToHigherTree(root.left, obj);   
};

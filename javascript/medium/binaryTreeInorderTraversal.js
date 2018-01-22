/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var inorderTraversal = function(root) {
    const stack = new Array(), res = new Array();
    goLeft(stack, root);
    while(stack.length > 0) {
        let top = stack.pop();
        res.push(top.val);
        goLeft(stack, top.right);
    }
    return res;
};

var goLeft = function(stack, root) {
    while(root !== null) {
        stack.push(root);
        root = root.left;
    }
};

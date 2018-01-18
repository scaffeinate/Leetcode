/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} t
 * @return {string}
 */
var tree2str = function(t) {
    if(t === null) return "";
    if(t.left === null && t.right === null) {
        return t.val.toString();
    }
    let str = t.val + "(" +tree2str(t.left) + ")";
    let right = tree2str(t.right);
    if(right !== "") {
        str += "(" + right + ")";
    }
    return str;
};

/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {Integer}
 */
var getMinimumDifference = function(root) {
    const obj = { min: null, prev: null };
    getMinimumAbsDistance(root, obj);
    return obj.min === null ? 0 : obj.min;
};

var getMinimumAbsDistance = function(root, obj) {
    if(root === null) return;
    getMinimumAbsDistance(root.left, obj);
    if(obj.prev !== null) {
        let min = obj.min, diff = Math.abs(root.val - obj.prev);
        obj.min = ((min === null) ? diff : Math.min(min, diff));
    }
    obj.prev = root.val;
    getMinimumAbsDistance(root.right, obj);
};

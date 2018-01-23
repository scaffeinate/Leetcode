/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} k
 * @return {number}
 */
var kthSmallest = function(root, k) {
    const map = new Map();
    countNodes(root, map);
    return findKth(root, k, map).val;
};

var findKth = function(root, k, map) {
    if(root === null) return null;
    const count = map.get(root);
    const n = count[0] + 1;
    if(n === k) {
        return root;
    } else if(k < n) {
        return findKth(root.left, k, map);
    } else {
        return findKth(root.right, (k-n), map);
    }
};

var countNodes = function(root, map) {
    if(root === null) return 0;
    const left = countNodes(root.left, map);
    const right = countNodes(root.right, map);
    map.set(root, [left, right]);
    return 1 + left + right;
};

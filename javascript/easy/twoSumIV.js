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
 * @return {boolean}
 */
var findTarget = function(root, k) {
    const list = new Array();
    inOrder(root, list);
    let i = 0, j = list.length-1;
    while(i < j) {
        let sum = list[i] + list[j];
        if(sum === k) {
            return true;
        } else if(sum < k) {
            i++;
        } else {
            j--;
        }
    }
    return false;
};

var inOrder = function(root, list) {
    if(root === null) return;
    inOrder(root.left, list);
    list.push(root.val);
    inOrder(root.right, list);
}

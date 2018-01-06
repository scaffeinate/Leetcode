/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {number[]} nums
 * @return {TreeNode}
 */
var sortedArrayToBST = function(nums) {
    return constructBST(nums, 0, nums.length-1);
};

var constructBST = function(nums, start, end) {
    if(start > end) return null;
    let middle = parseInt((start + end)/2);
    let root = new TreeNode(nums[middle]);
    root.left = constructBST(nums, start, middle-1);
    root.right = constructBST(nums, middle+1, end);
    return root;
};

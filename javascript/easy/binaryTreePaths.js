/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {string[]}
 */
var binaryTreePaths = function(root) {
    let results = [], arr = [];
    dfs(root, arr, results);
    return results;
};

let dfs = function(root, arr, results) {
    if(root == null) {
        return;
    } else if(root.left === null && root.right === null) {
        str = "";
        for(let i = 0; i < arr.length; i++) {
            str += arr[i] + "->";
        }
        results.push(str + root.val);
    } else {
        arr.push(root.val);
        dfs(root.left, arr, results);
        dfs(root.right, arr, results);
        arr.pop();
    }
}

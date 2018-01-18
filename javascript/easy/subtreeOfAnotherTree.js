/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} s
 * @param {TreeNode} t
 * @return {boolean}
 */
var isSubtree = function(s, t) {
    const set = new Set();
    dfs(s, set);
    const res = dfs(t, null);
    return set.has(res);
};

var dfs = function(s, set) {
    if(s === null) return '$';
    str = s.val + dfs(s.left, set) + dfs(s.right, set);
    if(set !== null) {
        set.add(str);    
    }
    return str;
};

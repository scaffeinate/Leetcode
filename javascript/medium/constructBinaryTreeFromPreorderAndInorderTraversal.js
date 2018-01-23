/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {number[]} preorder
 * @param {number[]} inorder
 * @return {TreeNode}
 */
var buildTree = function(preorder, inorder) {
    const map = new Map();
    let root = null;
    for(let i = 0; i < inorder.length; i++) {
        map.set(inorder[i], i);
    }
    
    for(let i = 0; i < preorder.length; i++) {
        root = insert(root, preorder[i], map);
    }
    return root;
};

var insert = function(root, num, map) {
    if(root === null) {
        root = new TreeNode(num);
    } else {
        if(map.get(num) < map.get(root.val)) {
            root.left = insert(root.left, num, map);
        } else {
            root.right = insert(root.right, num, map);
        }
    }
    return root;
};

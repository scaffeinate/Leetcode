/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var minDepth = function(root) {
    if(root == null) return 0
    let queue = []
    queue.unshift({ node: root, depth: 0});
    while(queue.length > 0) {
        let current = queue.pop();
        if(current.node.left == null && current.node.right == null) {
            return current.depth + 1;
        }

        if(current.node.left != null) {
            queue.unshift({ node: current.node.left, depth: current.depth + 1 });
        }

        if(current.node.right != null) {
            queue.unshift({ node: current.node.right, depth: current.depth + 1 });
        }
    }

    return 0;
};

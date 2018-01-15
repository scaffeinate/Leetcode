/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} sum
 * @return {number}
 */
var pathSum = function(root, sum) {
    const map = new Map();
    return countPaths(root, sum, 0, map);
};

var countPaths = function(root, sum, runningSum, map) {
    if(root === null) return 0;
    runningSum += root.val;
    let totalCount = (runningSum === sum) ? 1 : 0;
    
    if(map.get(runningSum - sum) !== undefined) {
        totalCount += map.get(runningSum - sum);
    }
    
    let numPaths = map.get(runningSum);
    numPaths = (numPaths === undefined) ? 1 : numPaths+1;
    map.set(runningSum, numPaths);
    
    totalCount += countPaths(root.left, sum, runningSum, map) + countPaths(root.right, sum, runningSum, map);
    if(numPaths === 1) {
        map.delete(runningSum);
    } else {
        map.set(runningSum, numPaths-1);
    }
    
    return totalCount;
};

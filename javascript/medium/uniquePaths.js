/**
 * @param {number} m
 * @param {number} n
 * @return {number}
 */
var uniquePaths = function(m, n) {
    const memo = new Array();
    for(let i = 0; i < m; i++) {
        const arr = new Array();
        for(let j = 0; j < n; j++) {
            arr.push(-1);
        }
        memo.push(arr);
    }
    return findUniquePaths(0, 0, m, n, memo);
};

var findUniquePaths = function(i, j, m, n, memo) {
    if(i === m-1 && j === n-1) {
        return 1;
    } else if(i < 0 || i >= m || j < 0 || j >= n) {
        return 0;
    } else if(memo[i][j] === -1) {
        memo[i][j] = findUniquePaths(i+1, j, m, n, memo) + findUniquePaths(i, j+1, m, n, memo);
    }
    return memo[i][j];
};

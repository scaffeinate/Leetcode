/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    return climbStairsMemo(n, []);
};

var climbStairsMemo = function(n, memo) {
    if(n == 0) {
        return 1;
    } else if(n < 0) {
        return 0;
    } else if(memo[n] === undefined) {
        memo[n] = climbStairsMemo(n-1, memo) + climbStairsMemo(n-2, memo);
    }
    return memo[n];
};

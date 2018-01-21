/**
 * @param {number[]} cost
 * @return {number}
 */
var minCostClimbingStairs = function(cost) {
    if(cost.length <= 0) return 0;
    const memo = new Array(cost.length), n = cost.length;
    for(let i = n-1; i >= 0; i--) {
        memo[i] = cost[i];
        let next = (i < n-1) ? memo[i+1] : 0;
        let next2 = (i < n-2) ? memo[i+2] : 0;
        memo[i] += Math.min(next, next2);
    }
    return Math.min(memo[0], memo[1]);
};

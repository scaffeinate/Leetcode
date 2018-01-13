/**
 * @param {number[][]} costs
 * @return {number}
 */
var minCost = function(costs) {
    if(costs.length == 0) return 0;

    let min = Number.MAX_SAFE_INTEGER, memo = [[]];
    for(let i = 0; i < costs.length; i++) {
        memo[i] = [-1, -1, -1];
    }
    for(let i = 0; i < 3; i++) {
        min = Math.min(min, costs[0][i] + minimumCost(1, i, costs, memo));
    }
    return min;
};

var minimumCost = function(i, prev, costs, memo) {
    if(i == costs.length) {
        return 0;
    } else if(memo[i][prev] === -1) {
        let min = Number.MAX_SAFE_INTEGER;
        for(let j = 0; j < 3; j++) {
            if(j !== prev) {
                min = Math.min(min, (costs[i][j] + minimumCost(i+1, j, costs, memo)));
            }
        }
        memo[i][prev] = min;
    }
    return memo[i][prev];
}

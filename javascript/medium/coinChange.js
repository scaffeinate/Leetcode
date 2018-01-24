/**
 * @param {number[]} coins
 * @param {number} amount
 * @return {number}
 */
var coinChange = function(coins, amount) {
    const memo = new Array();
    for(let i = 0; i <= amount; i++) {
        memo[i] = Number.MAX_SAFE_INTEGER;
    }
    memo[0] = 0;
    for(let coin of coins) {
        for(let i = 0; i < memo.length; i++) {
            if(i >= coin && memo[i - coin] !== Number.MAX_SAFE_INTEGER) {
                memo[i] = Math.min(memo[i], (memo[i - coin] + 1));
            }
        }
    }
    return (memo[memo.length-1] === Number.MAX_SAFE_INTEGER) ? -1 : memo[memo.length-1];
};

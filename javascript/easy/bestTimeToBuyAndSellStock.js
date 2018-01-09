/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let maxProfit = 0, i = 0, j = 1;
    while(j < prices.length) {
        maxProfit = Math.max(maxProfit, (prices[j] - prices[i]));
        if(prices[j] < prices[i]) {
            i = j;
        }
        j++;
    }
    return maxProfit;
};

/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let maxProfit = 0, i = 0, j = 1;
    while(j < prices.length) {
        let profit = prices[j] - prices[i];
        if(profit > 0) {
            maxProfit += profit;
        }
        i++; j++;
    }
    return maxProfit;
};

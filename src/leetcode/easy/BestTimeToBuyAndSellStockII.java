package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, i = 0, j = 1;
        while (j < prices.length) {
            int profit = prices[j] - prices[i];
            if (profit > 0) maxProfit += profit;
            i++;
            j++;
        }
        return maxProfit;
    }
}

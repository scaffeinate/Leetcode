package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0, j = 1; j < prices.length; j++) {
            int profit = prices[j] - prices[i];
            max = Math.max(max, profit);
            if (profit < 0) i = j;
        }
        return max;
    }
}

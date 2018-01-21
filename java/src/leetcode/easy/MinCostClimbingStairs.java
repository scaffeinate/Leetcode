class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] memo = new int[cost.length];
        Arrays.fill(memo, -1);
        return Math.min(minCost(0, cost, memo), minCost(1, cost, memo));
    }
    
    private int minCost(int i, int[] cost, int[] memo) {
        if(i >= cost.length) {
            return 0;
        } else if(memo[i] == -1) {
            int nextCost = minCost(i+1, cost, memo);
            int nextCost2 = minCost(i+2, cost, memo);
            memo[i] = cost[i] + Math.min(nextCost, nextCost2);
        }
        return memo[i];
    }
}

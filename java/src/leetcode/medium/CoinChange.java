public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        for(int i = 0; i < memo.length; i++) {
            memo[i] = Integer.MAX_VALUE;
        }
        memo[0] = 0;
        
        for(int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            for(int j = 1; j < memo.length; j++) {
                if(coin <= j && memo[j - coin] != Integer.MAX_VALUE) {
                    memo[j] = Math.min(memo[j], (memo[j - coin] + 1));
                }    
            }
        }
        
        return memo[memo.length - 1] == Integer.MAX_VALUE ? -1 : memo[memo.length - 1];
    }
}

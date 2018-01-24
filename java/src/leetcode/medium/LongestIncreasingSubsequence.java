public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] memo = new int[nums.length];
        int max = 0;
        Arrays.fill(memo, 1);
        
        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if((nums[j] < nums[i]) && (memo[j] + 1 > memo[i])) {
                    memo[i] = memo[j] + 1;
                }
            }
        }
        
        for(int i = 0; i < memo.length; i++) max = Math.max(max, memo[i]);
        return max;
    }
}

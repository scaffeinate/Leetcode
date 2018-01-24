public class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length <= 1) return true;
        boolean[] memo = new boolean[nums.length];
        memo[memo.length - 1] = true;
        int j = memo.length - 1, i = j - 1;
        while(i >= 0) {
            int index = Math.min((j - i), nums[i]);
            memo[i] = memo[i + index];
            if(memo[i]) j = i;
            i--;
        }
        return memo[0];
    }
}

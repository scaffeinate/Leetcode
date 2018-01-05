package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/house-robber/description/
 */
public class HouseRobber {
    public int rob(int[] nums) {
        int prev = 0, alternate = 0, temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = prev;
            prev = Math.max(nums[i] + alternate, prev);
            alternate = temp;
        }
        return prev;
    }
}

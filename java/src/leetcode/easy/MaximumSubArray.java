package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/maximum-subarray/description/
 */
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, runningMax = 0;
        for (int i = 0; i < nums.length; i++) {
            runningMax = Math.max(nums[i], runningMax + nums[i]);
            max = Math.max(max, runningMax);
        }
        return max;
    }
}

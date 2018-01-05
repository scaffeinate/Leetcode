package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/missing-number/description/
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0, n = nums.length;
        for (int num : nums) sum += num;
        return ((n * (n + 1)) / 2) - sum;
    }
}

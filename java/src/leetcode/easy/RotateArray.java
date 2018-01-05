package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/rotate-array/description/
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) return;
        k %= n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        if (start >= end) return;
        swap(nums, start, end);
        reverse(nums, start + 1, end - 1);
    }

    private void swap(int[] nums, int i, int j) {
        if (i == j) return;
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
}

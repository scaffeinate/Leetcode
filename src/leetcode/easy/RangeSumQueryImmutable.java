package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/range-sum-query-immutable/description/
 */
public class RangeSumQueryImmutable {
    private int[] sumArr;

    public RangeSumQueryImmutable(int[] nums) {
        if (nums.length == 0) return;
        sumArr = new int[nums.length];
        sumArr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sumArr[i] = (sumArr[i - 1] + nums[i]);
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) return sumArr[j];
        return sumArr[j] - sumArr[i - 1];
    }
}

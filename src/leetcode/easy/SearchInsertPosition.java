package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/search-insert-position/description/
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, 0, nums.length - 1, target);
    }

    private int searchInsert(int[] nums, int start, int end, int target) {
        if (start > end) {
            return end + 1;
        }
        int middle = (start + end) / 2;
        if (nums[middle] == target) {
            return middle;
        } else if (nums[middle] > target) {
            return searchInsert(nums, start, middle - 1, target);
        } else {
            return searchInsert(nums, middle + 1, end, target);
        }
    }
}

package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}

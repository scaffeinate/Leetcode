package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/remove-element/description/
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] != val) {
                swap(nums, i, j);
                i++;
            }
            j++;
        }
        return i;
    }

    private void swap(int[] arr, int i, int j) {
        if (i != j) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }
    }
}

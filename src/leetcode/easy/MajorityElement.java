package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int counter = 0, majority = 0;
        for (int i = 0; i < nums.length; i++) {
            if (counter == 0) {
                majority = nums[i];
            }
            if (nums[i] == majority) counter++;
            else counter--;
        }

        return majority;
    }
}

package leetcode.easy;

import java.util.TreeSet;

/**
 * Question: https://leetcode.com/problems/third-maximum-number/description/
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                if (set.size() < 3) {
                    set.add(nums[i]);
                } else if (set.first() < nums[i]) {
                    set.pollFirst();
                    set.add(nums[i]);
                }
            }
        }

        return (set.size() < 3) ? set.last() : set.first();
    }
}

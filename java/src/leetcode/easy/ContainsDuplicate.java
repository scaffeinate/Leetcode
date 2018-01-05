package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Question: https://leetcode.com/problems/contains-duplicate/description/
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }
}

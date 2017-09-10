package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Question: https://leetcode.com/problems/contains-duplicate-ii/description/
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (indexMap.containsKey(nums[i])) {
                if (Math.abs(i - indexMap.get(nums[i])) <= k) return true;
            }
            indexMap.put(nums[i], i);
        }

        return false;
    }
}

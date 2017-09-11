package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Question: https://leetcode.com/problems/intersection-of-two-arrays/description/
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int j = 0;
        for (int i = 0; i < nums1.length; i++) set.add(nums1[i]);
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                result[j] = nums2[i];
                j++;
                set.remove(nums2[i]);
            }
        }

        return Arrays.copyOfRange(result, 0, j);
    }
}

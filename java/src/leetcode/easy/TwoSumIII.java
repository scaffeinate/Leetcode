package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Question: https://leetcode.com/problems/two-sum-iii-data-structure-design/description/
 */
public class TwoSumIII {
    private Map<Integer, Integer> map = null;

    /**
     * Initialize your data structure here.
     */
    public TwoSumIII() {
        map = new HashMap<Integer, Integer>();
    }

    /**
     * Add the number to an internal data structure..
     */
    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0) + 1);
    }

    /**
     * Find if there exists any pair of numbers which sum is equal to the value.
     */
    public boolean find(int value) {
        for (Integer key : map.keySet()) {
            if ((key == (value - key) && map.get(key) > 1) ||
                    (key != (value - key) && map.containsKey(value - key))) {
                return true;
            }
        }
        return false;
    }
}

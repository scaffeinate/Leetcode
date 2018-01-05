package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Question: https://leetcode.com/problems/pascals-triangle/description/
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows != 0) {
            result.add(Arrays.asList(new Integer[]{1}));
            for (int i = 1; i < numRows; i++) {
                List<Integer> prev = result.get(i - 1);
                List<Integer> row = new ArrayList<Integer>();
                row.add(1);
                for (int j = 1; j < prev.size(); j++) {
                    row.add(prev.get(j) + prev.get(j - 1));
                }
                row.add(1);
                result.add(row);
            }
        }
        return result;
    }
}

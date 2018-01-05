package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Question: https://leetcode.com/problems/pascals-triangle-ii/description/
 */
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<Integer>();
        prev.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for (int j = 1; j < prev.size(); j++) {
                row.add(prev.get(j) + prev.get(j - 1));
            }
            row.add(1);
            prev = row;
        }
        return prev;
    }
}

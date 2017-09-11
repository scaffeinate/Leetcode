package leetcode.easy;

import common.NestedInteger;

import java.util.List;

/**
 * Question: https://leetcode.com/problems/nested-list-weight-sum/description/
 */
public class NestedListWeightSum {
    public int depthSum(List<NestedInteger> nestedList) {
        return depthSum(nestedList, 1);
    }

    private int depthSum(List<NestedInteger> nestedList, int depth) {
        int sum = 0;
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                sum += (nestedInteger.getInteger() * depth);
            } else {
                sum += depthSum(nestedInteger.getList(), depth + 1);
            }
        }
        return sum;
    }
}

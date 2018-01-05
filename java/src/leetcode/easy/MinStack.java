package leetcode.easy;

import java.util.Stack;

/**
 * Question: https://leetcode.com/problems/min-stack/description/
 */
public class MinStack {
    Stack<int[]> stack = null;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<int[]>();
    }

    public void push(int x) {
        int[] values = new int[2];
        values[0] = x;
        values[1] = stack.isEmpty() ? x : Math.min(x, stack.peek()[1]);
        stack.push(values);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }
}

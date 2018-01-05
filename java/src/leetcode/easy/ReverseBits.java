package leetcode.easy;

import java.util.Stack;

/**
 * Question: https://leetcode.com/problems/reverse-bits/description/
 */
public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0, mul = 1, i = 0;
        Stack<Integer> stack = new Stack<Integer>();
        while (i < 32) {
            stack.push(n & 1);
            n >>>= 1;
            i++;
        }

        while (!stack.isEmpty()) {
            result += (stack.pop() * mul);
            mul *= 2;
        }

        return result;
    }
}

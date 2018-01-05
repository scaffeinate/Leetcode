package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = -1;
        }

        return climbStairs(n, memo);
    }

    private int climbStairs(int n, int[] memo) {
        if (n == 0 || n == 1) {
            return 1;
        } else if (memo[n] == -1) {
            memo[n] = climbStairs(n - 1, memo) + climbStairs(n - 2, memo);
        }

        return memo[n];
    }
}

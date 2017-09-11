package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/valid-perfect-square/description/
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        return binarySearch(num, 0, num);
    }

    private boolean binarySearch(int num, int start, int end) {
        if (start > end) return false;
        long middle = (start + end) / 2;
        long square = middle * middle;
        if (square == num) {
            return true;
        } else if (square > num) {
            return binarySearch(num, start, (int) middle - 1);
        } else {
            return binarySearch(num, (int) middle + 1, end);
        }
    }
}

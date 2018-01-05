package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/first-bad-version/description/
 */
public class FirstBadVersion {

    private int badVersion = 0;

    public FirstBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    public int firstBadVersion(int n) {
        return firstBadVersion(1, n);
    }

    private int firstBadVersion(int start, int end) {
        if (start > end) return start;
        int middle = (int) (((long) start + end) / 2);
        if (isBadVersion(middle)) {
            return firstBadVersion(start, middle - 1);
        } else {
            return firstBadVersion(middle + 1, end);
        }
    }

    private boolean isBadVersion(int n) {
        return n == this.badVersion;
    }
}

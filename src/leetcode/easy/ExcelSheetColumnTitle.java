package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/excel-sheet-column-title/description/
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder builder = new StringBuilder();
        while (n > 0) {
            int r = n % 26;
            n -= (r == 0) ? 1 : 0;
            builder.insert(0, convert(r == 0 ? 26 : r));
            n /= 26;
        }
        return builder.toString();
    }

    private char convert(int n) {
        return (char) ('A' + n - 1);
    }
}

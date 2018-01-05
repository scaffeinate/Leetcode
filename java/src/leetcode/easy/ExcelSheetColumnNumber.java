package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/excel-sheet-column-number/description/
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int sum = 0, prod = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            sum += (getCell(s.charAt(i)) * prod);
            prod *= 26;
        }
        return sum;
    }

    private int getCell(char c) {
        return ((c >= 'a' && c <= 'z') ? (c - 'a') : (c - 'A')) + 1;
    }
}

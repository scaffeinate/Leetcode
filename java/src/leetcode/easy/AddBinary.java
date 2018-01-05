package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/add-binary/description/
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        char carry = '0';
        while (i >= 0 && j >= 0) {
            int sum = (a.charAt(i) - '0') + (b.charAt(j) - '0') + (carry - '0');
            carry = helper(sum, builder);
            i--;
            j--;
        }

        while (i >= 0) {
            carry = helper((a.charAt(i) - '0') + (carry - '0'), builder);
            i--;
        }

        while (j >= 0) {
            carry = helper((b.charAt(j) - '0') + (carry - '0'), builder);
            j--;
        }

        if (carry == '1') {
            builder.append(1);
        }
        return builder.reverse().toString();
    }

    private char helper(int sum, StringBuilder builder) {
        builder.append((sum == 0 || sum == 2) ? 0 : 1);
        return (sum > 1) ? '1' : '0';
    }
}

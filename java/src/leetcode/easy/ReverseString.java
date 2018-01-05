package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/reverse-string/description/
 */
public class ReverseString {
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        for (int i = 0; i < (len / 2); i++) {
            arr[i] += arr[len - i - 1];
            arr[len - i - 1] = (char) (arr[i] - arr[len - i - 1]);
            arr[i] = (char) (arr[i] - arr[len - i - 1]);
        }

        return new String(arr);
    }
}

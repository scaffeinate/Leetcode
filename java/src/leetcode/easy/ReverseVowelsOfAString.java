package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/reverse-vowels-of-a-string/description/
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        String vowel = "AEIOUaeiou";
        while (i < j) {
            while (i < j && vowel.indexOf(arr[i]) < 0) i++;
            while (i < j && vowel.indexOf(arr[j]) < 0) j--;
            if (i != j) {
                arr[i] += arr[j];
                arr[j] = (char) (arr[i] - arr[j]);
                arr[i] = (char) (arr[i] - arr[j]);
            }
            i++;
            j--;
        }

        return new String(arr);
    }
}

public class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int i = 0;
        while(i < arr.length) {
            reverse(arr, i, Math.min(arr.length, (i + k)));
            i += 2 * k;
        }
        return new String(arr);
    }
    
    private void reverse(char[] arr, int start, int end) {
        for(int i = start, j = end - 1; i < j; i++, j--) {
            arr[i] += arr[j];
            arr[j] = (char) (arr[i] - arr[j]);
            arr[i] = (char) (arr[i] - arr[j]);
        }
    }
}

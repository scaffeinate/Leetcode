class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int i = 0, j = 0, len = Integer.MAX_VALUE, sum = 0;
        while(j < nums.length) {
            sum += nums[j];
            while(i <= j && sum >= s) {
                len = Math.min(len, (j-i+1));
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return (len == Integer.MAX_VALUE) ? 0 : len;
    }
}

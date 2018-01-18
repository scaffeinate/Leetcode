public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = Integer.MIN_VALUE, baseSum = 0;
        int n = nums.length;
        if(nums.length == 0) return maxAverage;
        
        for(int i = 0; i < k - 1; i++) {
            baseSum += nums[i];
        }
        
        for(int i = 0; i <= (n - k); i++) {
            baseSum += nums[i + k - 1];
            maxAverage = Math.max(maxAverage, baseSum/k);
            baseSum -= nums[i];
        }
        
        return maxAverage;
    }
}

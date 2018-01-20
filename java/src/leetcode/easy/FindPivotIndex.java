class Solution {
    public int pivotIndex(int[] nums) {
        int[] sums = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }

        for(int i = 0; i < nums.length; i++) {
            int left = ((i == 0) ? 0 : sums[i-1]);
            int right = ((i == nums.length-1) ? 0 : (sum - sums[i]));
            if(left == right) {
                return i;
            }
        }

        return -1;
    }
}

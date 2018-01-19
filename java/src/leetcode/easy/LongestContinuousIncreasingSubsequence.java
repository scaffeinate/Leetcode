class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int lcis = 0, count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i == 0 || nums[i] > nums[i-1]) {
                count++;
            } else {
                lcis = Math.max(lcis, count);
                count = 1;
            }
        }
        return Math.max(lcis, count);
    }
}

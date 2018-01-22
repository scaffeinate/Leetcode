class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;
        int i = 0, j = 1, minI = Integer.MAX_VALUE, minJ = Integer.MAX_VALUE;
        while(j < nums.length) {
            if(nums[j] > minJ) {
                return true;
            }
            
            if(nums[j] > nums[i]) {
                minI = Math.min(minI, nums[i]);
                minJ = Math.min(minJ, nums[j]);
            } else {
                i = j;
            }
            
            j++;
        }
        
        return false;
    }
}

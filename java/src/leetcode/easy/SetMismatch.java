public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if(nums[num-1] < 0) {
                res[0] = num;
            } else {
                nums[num-1] = -nums[num-1];
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) res[1] = i + 1;
        }
        
        return res;
    }
}

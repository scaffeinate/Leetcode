class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int i = 0, count = 0;
        while(i < nums.length) {
            int num = nums[i++];
            if(findPair(nums,i,num+k)) {
                count++;
            }
            while(i < nums.length && nums[i] == num) i++;
        }
        return count;
    }
    
    private boolean findPair(int[] nums, int start, int target) {
        int end = nums.length-1;
        while(start <= end) {
            int middle = (start + end)/2;
            if(nums[middle] == target) {
                return true;
            } else if(nums[middle] < target) {
                start = middle+1;
            } else {
                end = middle-1;
            }
        }
        return false;
    }
}

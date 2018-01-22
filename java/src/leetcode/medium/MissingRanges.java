class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> results = new ArrayList<String>();
        if(nums.length == 0) {
            addMissingRanges(lower, upper, results);
        } else {
            addMissingRanges(lower, (long) nums[0]-1, results);
            for(int i = 1; i < nums.length; i++) {
                addMissingRanges((long) nums[i-1]+1, (long) nums[i]-1, results);
            }
            addMissingRanges((long) nums[nums.length-1]+1, upper, results);
        }
        return results;
    }
    
    private void addMissingRanges(long lower, long upper, List<String> results) {
        if(upper >= lower) {
            long diff = (upper - lower);
            StringBuilder builder = new StringBuilder();
            builder.append(lower);
            if(diff > 0) {
                builder.append("->").append(upper);
            }
            results.add(builder.toString());
        }
    }
}

class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        int maxLen = 0, sum = 0;
        Map<Integer,Integer> indexesMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum == k) { 
                maxLen = i+1; 
            } else if(indexesMap.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, (i - indexesMap.get(sum-k)));
            }
            indexesMap.putIfAbsent(sum, i);
        }
        return maxLen;
    }
}

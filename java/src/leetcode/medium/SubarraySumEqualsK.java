public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum == k) {
                count++;
            }
            
            if(counter.containsKey(sum - k)) {
                count += counter.get(sum - k);
            }
            counter.put(sum, counter.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}

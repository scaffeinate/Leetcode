class Solution {
    public int findShortestSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        int minLength = nums.length, degree = 0;
        Map<Integer, Integer> degreeMap = new HashMap<>();
        Map<Integer, Integer> indexMap = new HashMap<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int freq = degreeMap.getOrDefault(nums[i], 0) + 1;
            degreeMap.put(nums[i], freq);
            indexMap.putIfAbsent(nums[i], i);
            if(degree < freq) {
                degree = freq;
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            int index = indexMap.get(nums[i]);
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0)+1);
            if(freqMap.get(nums[i]) == degree && (i - index + 1) < minLength) {
                minLength = (i - index + 1);
            }
        }
        
        return minLength;
    }
}

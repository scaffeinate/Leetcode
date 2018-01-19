class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int n = nums.length;
        String[] result = new String[n];
        for(int i = 0; i < n; i++) {
            indexMap.put(nums[i], i);
        }
        Arrays.sort(nums);
        for(int i = 0; i < n; i++) {
            int index = indexMap.get(nums[i]);
            int rank = (n - i);
            if(rank == 1) {
                result[index] = "Gold Medal";
            } else if(rank == 2) {
                result[index] = "Silver Medal";
            } else if(rank == 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(rank);
            }
        }
        return result;
    }
}

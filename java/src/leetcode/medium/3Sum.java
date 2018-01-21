class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int i = 0, num = 0;
        while(i < nums.length) {
            if(i > 0 && num == nums[i]) {
                i++; continue;
            }
            num = nums[i];
            searchPairs(nums, i+1, -num, results);
            i++;
        }
        return results;
    }

    private void searchPairs(int[] nums, int index, int target,  List<List<Integer>> results) {
        int i = index, j = nums.length-1;
        while(i < j) {
            int sum = nums[i] + nums[j];
            if(sum == target) {
                int t1 = nums[i], t2 = nums[j];
                results.add(Arrays.asList(new Integer[] { -target, t1, t2 }));
                while(i < j && nums[i] == t1) { i++; }
                while(i < j && nums[j] == t2) { j--; }
            } else if(sum < target) {
                i++;
            } else {
                j--;
            }
        }
    }
}

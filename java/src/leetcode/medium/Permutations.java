public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        permutate(nums, 0, results);
        return results;
    }
    
    private void permutate(int[] nums, int index, List<List<Integer>> results) {
        if(index == nums.length) {
            results.add(getList(nums));
            return;
        }
        
        for(int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            permutate(nums, index+1, results);
            swap(nums, index, i);
        }
    }
    
    private List<Integer> getList(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int num:nums) result.add(num);
        return result;
    }
    
    private void swap(int[] nums, int i, int j) {
        if(i != j) {
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
        }
    }
}

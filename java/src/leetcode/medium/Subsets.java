class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        subsets(nums, 0, results, new Stack<Integer>());
        return results;
    }

    private void subsets(int[] nums, int index, List<List<Integer>> results, Stack<Integer> stack) {
        results.add((List<Integer>) stack.clone());
        for(int i = index; i < nums.length; i++) {
            stack.push(nums[i]);
            subsets(nums, i+1, results, stack);
            stack.pop();
        }
    }
}

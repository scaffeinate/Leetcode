public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        generateCombinationSum(0, target, candidates, new Stack<Integer>(), res);
        return res;
    }
    
    private void generateCombinationSum(int index, int target, int[] candidates, Stack<Integer> temp, List<List<Integer>> res) {
        if(target == 0) {
            res.add((List<Integer>) temp.clone());
        } else if(target > 0) {
            for(int i = index; i < candidates.length; i++) {
                temp.push(candidates[i]);
                generateCombinationSum(i, (target - candidates[i]), candidates, temp, res);
                temp.pop();
            }
        }
    }
}

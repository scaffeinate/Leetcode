import java.util.Map.*;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        for(int i = 0; i < candidates.length; i++) {
            counter.put(candidates[i], counter.getOrDefault(candidates[i], 0) + 1);
        }
        List<Entry<Integer, Integer>> counterList = new ArrayList<Entry<Integer, Integer>>();
        counterList.addAll(counter.entrySet());
        recurse(counterList, 0, new Stack<Integer>(), results, 0, target);
        return results;
    }
    
    private void recurse(List<Entry<Integer, Integer>> counterList, int index, Stack<Integer> stack, 
                        List<List<Integer>> results, int sum, int target) {
        if(sum > target) return;
        if(sum == target)  {
            results.add((List<Integer>) stack.clone());
        } else {
            for(int i = index; i < counterList.size(); i++) {
                Entry<Integer, Integer> entry = counterList.get(i);
                int value = entry.getValue();
                if(value > 0) {
                    stack.push(entry.getKey());
                    entry.setValue(value - 1);
                    recurse(counterList, i, stack, results, sum + entry.getKey(), target);
                    entry.setValue(value);
                    stack.pop();
                }
            }
        }
    }
    
}

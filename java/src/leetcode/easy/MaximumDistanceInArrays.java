class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        List<Integer> arr = arrays.get(0);
        int maxDistance = 0, min = arr.get(0), max = arr.get(arr.size()-1);
        for(int i = 1; i < arrays.size(); i++) {
            List<Integer> curr = arrays.get(i);
            maxDistance = Math.max(maxDistance, Math.abs(min - curr.get(curr.size()-1)));
            maxDistance = Math.max(maxDistance, Math.abs(max - curr.get(0)));
            min = Math.min(min, curr.get(0));
            max = Math.max(max, curr.get(curr.size()-1));
        }
        
        return maxDistance;
    }
}

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> results = new ArrayList<String>();
        int min = list1.length + list2.length;
        Map<String,Integer> indexMap = new HashMap<>();
        for(int i = 0; i < list1.length; i++) {
            indexMap.put(list1[i], i);
        }
        
        for(int i = 0; i < list2.length; i++) {
            String word = list2[i];
            if(indexMap.containsKey(word)) {
                min = Math.min(min, (indexMap.get(word) + i));
            }
        }
        
        for(int i = 0; i < list2.length; i++) {
            String word = list2[i];
            if(indexMap.containsKey(word) && (indexMap.get(word) + i) == min) {
                results.add(word);
            }
        }
        
        return results.toArray(new String[]{});
    }
}

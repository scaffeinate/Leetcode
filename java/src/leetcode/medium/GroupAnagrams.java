import java.util.Map.Entry;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<String, List<String>>();
        List<List<String>> result = new ArrayList<>();
        for(String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            List<String> group = anagramMap.getOrDefault(key, new ArrayList<String>());
            group.add(str);
            anagramMap.putIfAbsent(key, group);
        }
        
        Set<Entry<String, List<String>>> entrySet = anagramMap.entrySet();
        for(Entry<String, List<String>> entry : entrySet) {
            result.add(entry.getValue());
        }
        return result;
    }
}

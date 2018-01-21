class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int[] result = new int[A.length];
        for(int i = 0; i < B.length; i++) {
            indexMap.put(B[i], i);
        }
        
        for(int i = 0; i < A.length; i++) {
            result[i] = indexMap.getOrDefault(A[i], 0);
        }
        
        return result;
    }
}

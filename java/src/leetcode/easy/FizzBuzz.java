class Solution {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = FIZZ + BUZZ;
    
    public List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if((i % 3) == 0 && (i % 5) == 0) {
                results.add(FIZZBUZZ);
            } else if((i%3) == 0) {
                results.add(FIZZ);
            } else if((i%5) == 0) {
                results.add(BUZZ);
            } else {
                results.add(String.valueOf(i));
            }
        }
        return results;
    }
}

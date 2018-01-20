class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        while(left <= right) {
            if(isSelfDividing(left)) {
                result.add(left);
            }
            left++;
        }
        return result;
    }
    
    private boolean isSelfDividing(int num) {
        int x = num;
        while(x > 0) {
            int digit = (x % 10);
            if(digit == 0 || (num % digit) != 0) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
}

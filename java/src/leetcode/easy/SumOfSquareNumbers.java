public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        int sqrt = (int) Math.sqrt(c);
        for(int i = 0; i <= sqrt; i++) {
            int remaining = c - (i * i);
            if(Math.sqrt(remaining) % 1 == 0) {
                return true;
            }
        }
        return false;
    }
}

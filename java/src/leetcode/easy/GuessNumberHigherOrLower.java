/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1, end = n;
        while(start <= end) {
            int middle = (int) (((long) start + end)/2);
            int result = guess(middle);
            if(result == 0) {
                return middle;
            } else if(result > 0) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}

package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/guess-number-higher-or-lower/description/
 */
public class GuessNumberHigherOrLower extends GuessGame {

    public GuessNumberHigherOrLower(int guess) {
        super(guess);
    }

    public int guessNumber(int n) {
        return guessNumber(1, n);
    }

    private int guessNumber(int start, int end) {
        if (start > end) return start;
        int middle = (int) (((long) start + end) / 2);
        int guess = guess(middle);
        if (guess == 0) return middle;
        else if (guess == -1) {
            return guessNumber(start, middle - 1);
        } else {
            return guessNumber(middle + 1, end);
        }
    }
}

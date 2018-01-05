package leetcode.easy;

/**
 * Created by sudharti on 9/11/17.
 */
public class GuessGame {
    private int guess = 0;

    public GuessGame(int guess) {
        this.guess = guess;
    }

    public int guess(int n) {
        return (n == guess) ? 0 : ((guess > n) ? 1 : -1);
    }
}

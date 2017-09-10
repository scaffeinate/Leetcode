package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/count-primes/description/
 */
public class CountPrimes {
    public int countPrimes(int n) {
        if (n < 2) return 0;
        int i = 2, j, k, count = n - 1, sqrt = (int) Math.sqrt(n);
        int[] arr = new int[count];
        while (i <= sqrt) {
            if (arr[i - 2] == 0) {
                j = (i == 2) ? 2 : 3;
                while ((k = (i * j)) <= n) {
                    if (arr[k - 2] == 0) {
                        arr[k - 2]++;
                        count--;
                    }
                    j++;
                }
            }
            i++;
        }

        return arr[n - 2] == 0 ? count - 1 : count;
    }
}

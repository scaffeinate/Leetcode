package leetcode.easy;

/**
 * Question: https://leetcode.com/problems/paint-house/description/
 */
public class PaintHouse {
    public int minCost(int[][] costs) {
        int prevGreen = 0, prevRed = 0, prevBlue = 0;
        for (int i = 0; i < costs.length; i++) {
            int[] cost = costs[i];
            int red = Math.min(prevGreen, prevBlue) + cost[0];
            int green = Math.min(prevRed, prevBlue) + cost[1];
            int blue = Math.min(prevRed, prevGreen) + cost[2];

            prevRed = red;
            prevGreen = green;
            prevBlue = blue;
        }

        return Math.min(prevRed, Math.min(prevGreen, prevBlue));
    }
}

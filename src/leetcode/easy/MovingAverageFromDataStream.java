package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Question: https://leetcode.com/problems/moving-average-from-data-stream/description/
 */
public class MovingAverageFromDataStream {

    private int size = 0;
    private double sum = 0;
    private Queue<Integer> queue = null;

    /**
     * Initialize your data structure here.
     */
    public MovingAverageFromDataStream(int size) {
        this.size = size;
        this.queue = new LinkedList<Integer>();
    }

    public double next(int val) {
        double avg = 0;
        if (queue.size() >= this.size) {
            sum -= queue.poll();
        }
        queue.offer(val);
        sum += val;
        return (sum / queue.size());
    }
}

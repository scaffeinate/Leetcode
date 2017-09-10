package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Question: https://leetcode.com/problems/implement-stack-using-queues/description/
 */
public class ImplementStackUsingQueues {
    Queue<Integer> pushQueue = null, popQueue = null;

    /**
     * Initialize your data structure here.
     */
    public ImplementStackUsingQueues() {
        pushQueue = new LinkedList<Integer>();
        popQueue = new LinkedList<Integer>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        pushQueue.offer(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        pipe();
        return popQueue.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        if (popQueue.isEmpty()) {
            pipe();
        }
        int val = popQueue.poll();
        pushQueue.offer(val);
        return val;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return pushQueue.isEmpty() && popQueue.isEmpty();
    }

    private void pipe() {
        Queue<Integer> temp = pushQueue;
        while (pushQueue.size() > 1) {
            popQueue.offer(pushQueue.poll());
        }
        pushQueue = popQueue;
        popQueue = temp;
    }
}

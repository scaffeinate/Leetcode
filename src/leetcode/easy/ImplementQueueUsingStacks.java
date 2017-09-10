package leetcode.easy;

import java.util.Stack;

/**
 * Question: https://leetcode.com/problems/implement-queue-using-stacks/description/
 */
public class ImplementQueueUsingStacks {
    Stack<Integer> pushStack = null, popStack = null;

    /**
     * Initialize your data structure here.
     */
    public ImplementQueueUsingStacks() {
        pushStack = new Stack<Integer>();
        popStack = new Stack<Integer>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        pushStack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (popStack.isEmpty()) {
            copy();
        }
        return popStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (popStack.isEmpty()) {
            copy();
        }
        return popStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return (pushStack.isEmpty() && popStack.isEmpty());
    }

    private void copy() {
        while (!pushStack.isEmpty()) {
            popStack.push(pushStack.pop());
        }
    }
}

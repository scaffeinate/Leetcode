package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Question: https://leetcode.com/problems/logger-rate-limiter/description/
 */
public class LoggerRateLimiter {
    private Map<String, Integer> timestampMap = null;

    /**
     * Initialize your data structure here.
     */
    public LoggerRateLimiter() {
        timestampMap = new HashMap<String, Integer>();
    }

    /**
     * Returns true if the message should be printed in the given timestamp, otherwise returns false.
     * If this method returns false, the message will not be printed.
     * The timestamp is in seconds granularity.
     */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!timestampMap.containsKey(message) || (timestamp - timestampMap.get(message)) >= 10) {
            timestampMap.put(message, timestamp);
            return true;
        }
        return false;
    }
}

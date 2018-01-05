package leetcode.easy;

import java.util.Stack;

/**
 * Question: https://leetcode.com/problems/valid-parentheses/description/
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else if (stack.isEmpty()) return false;
            else {
                char c2 = stack.pop();
                if ((c == ']' && c2 != '[') || (c == '}' && c2 != '{') || (c == ')' && c2 != '('))
                    return false;
            }
        }

        return stack.isEmpty();
    }
}

class Solution {
    public int calPoints(String[] ops) {
        int points = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(String op : ops) {
            if(op.equals("+")) {
                int v1 = stack.pop(), v2 = stack.pop();
                stack.push(v2); 
                stack.push(v1);
                stack.push(v1 + v2);
            } else if(op.equals("C")) {
                stack.pop();
            } else if(op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        while(!stack.isEmpty()) {
            points += stack.pop();
        }
        return points;
    }
}

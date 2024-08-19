class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        //goes through each string in tokens array
        //if the next token is an instruction adds it to the pops the last two numbers and pushes it back onto the stack
        for (String c : tokens) {
            if (c.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (c.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (c.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (c.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push((int) ((double) b / a));
            } else {
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}

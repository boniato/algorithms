/* 
* https://leetcode.com/problems/valid-parentheses
*/

class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        
        Stack<Character> stack = new Stack();
        for (char c: s.toCharArray()) {
            if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

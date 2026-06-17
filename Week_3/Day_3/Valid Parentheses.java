class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If stack is empty, there's no matching opening bracket
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                // Check if the closing bracket matches the last opening bracket
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}
import java.util.ArrayList;

class Solution {
    boolean isOpenBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    boolean isClosedBracket(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    boolean isSameType(char open, char closed) {
        return (open == '(' && closed == ')') || (open == '[' && closed == ']') || (open == '{' && closed == '}');
    }

    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<Character>();

        for (char c : s.toCharArray()) {
            if(isOpenBracket(c)) {
                stack.add(c);
            } else {
                if(isClosedBracket(c)) {
                    if(stack.isEmpty()) return false;
                    
                    char lastItem = stack.get(stack.size() - 1);
                    if (!isSameType(lastItem, c)) return false;

                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

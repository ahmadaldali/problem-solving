class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char current = s.charAt(i);
            if (current == '[') {
                stack.push(current);
                continue;
            }

            if (current == ']') {
                char polled = stack.pop();
                String temp = "";
              
                while(polled != '[') {
                    temp = polled + temp;
                    polled = stack.pop();
                }

                // number before [
                String number = "";    
                while(!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    polled = stack.pop();
                    number = polled + number;
                }    
                
                for(int k=0;k<(Integer.parseInt(number));k++) {    
                    for(int j=0;j<temp.length();j++) {
                        stack.push(temp.charAt(j));
                    }
                }

                continue;
            }

            // digit or char
            stack.push(current);
        }

        String result = "";
        while(!stack.isEmpty()) {
            result = stack.pop() + result;
        }

        return result;
    }
}

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder results = new StringBuilder();

        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
                results.append('(');
            } else {
                if (s.charAt(i) == ')') {
                    int c = stack.isEmpty() ? -1 : stack.pop();
                    if (c == -1) {
                        results.append('#');
                    } else {
                        results.append(')');
                    }
                } else {
                    results.append(s.charAt(i));
                }
            }
        }

        while(!stack.isEmpty()) {
            results.setCharAt(stack.pop(), '#');
        }

        StringBuilder finalResult = new StringBuilder();
        for(int i=0;i< results.length();++i){
            if(results.charAt(i) !='#' ){
                finalResult.append(results.charAt(i));
            }
        }
        
        return finalResult.toString();
    }
}

// Time - space: O(n)

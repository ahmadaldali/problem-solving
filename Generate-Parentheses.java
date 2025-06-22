import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public List<String> generateParenthesis(int n) {
        if (n <= 0) return new ArrayList<>();

        List<String> result = new ArrayList<>();
        result.add("()");

        for (int i = 2; i <= n; i++) {
            Set<String> tempSet = new HashSet<>();
            for (String element : result) {
                // Insert "()" at every possible position in the string
                // starting from -1 because we have (k+1)
                for (int k = -1; k < element.length(); k++) {
                    String added = element.substring(0, k + 1) + "()" + element.substring(k + 1);
                    tempSet.add(added);
                }
            }
            result = new ArrayList<>(tempSet);
        }

        return result;
    }
}

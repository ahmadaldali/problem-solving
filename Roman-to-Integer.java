import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romans = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int result = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = romans.get(s.charAt(i));
            result = result + (current < prev ? -current : current);
            prev = current;
        }

        return result;
    }
}

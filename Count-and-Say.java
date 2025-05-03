class Solution {
    private String rle(String s) {
        if (s == null || s.length() == 0) return "";

        StringBuilder result = new StringBuilder();
        int count = 1;
        char prev = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == prev) {
                count++;
            } else {
                result.append(count).append(prev);
                prev = current;
                count = 1;
            }
        }
        result.append(count).append(prev);

        return result.toString();
    }

    public String countAndSay(int n) {
        if (n <= 1) return "1";

        return rle(countAndSay(n - 1));
    }
}

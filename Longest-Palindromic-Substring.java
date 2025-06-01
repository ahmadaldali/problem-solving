class Solution {
    public boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String result = s.charAt(0) + "";

        for (int end = 1; end < s.length(); end++) {
            int startLimit = (end + 1) - result.length();

            for (int start = 0; start < startLimit; start++) {
                String substring = s.substring(start, end + 1);
                if (isPalindrome(substring)) {
                    result = substring;
                    break;
                }
            }
        }

        return result;
    }
}

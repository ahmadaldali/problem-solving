class Solution {
    public int lengthOfLastWord(String s) {
        boolean hasChar = false;
        int spaces = 0;
        int len = s.length();

        for(int i=s.length() - 1; i>=0;i--) {
            if (s.charAt(i) == ' ') {
                if (len - (i+1) > 0) return (len - (i+1));
                len--;
            }
        }

        return len;
    }
}

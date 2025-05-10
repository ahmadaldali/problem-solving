class Solution {
    public int titleToNumber(String columnTitle) {
        // A --> value (len-1)
        // AA --> value(len-1) + 26*value
        // zy 702 --> 25 + 26*26
        // aaa 703.  value(len-1) + 26*value + 26*26*value ..

        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
           int value = columnTitle.charAt(i) - 'A' + 1;
            result += value * Math.pow(26, columnTitle.length() - 1 - i);
        }

        return result;
    }
}

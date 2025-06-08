class Solution {
    public int numDecodings(String s) {
        int[] result = new int[s.length()];

        result[0] = (s.charAt(0) != '0') ? 1 : 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                result[i] += result[i - 1];
            }

            int twoDigits = Integer.parseInt(s.substring(i - 1, i + 1));
            if (twoDigits >= 10 && twoDigits <= 26) {
                result[i] += (i >= 2) ? result[i - 2] : 1;
            }
        }

        return result[s.length()-1];
    }
}

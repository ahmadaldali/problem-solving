class Solution {
    public String sortString(String s) {
        int[] count = new int[26];
        for(char c : s.toCharArray()) {
            count[c - 'a'] += 1;
        }
        
        String res = "";
        while(res.length() != s.length()) {
            for(int i=0;i<26;i++) {
                if (count[i] > 0) {
                    res += (char)(i + 'a');
                    count[i]--;
                }
            }

            for(int i=25;i>=0;i--) {
                if (count[i] > 0) {
                    res += (char)(i + 'a');
                    count[i]--;
                }
            }

        }

        return res;
    }
}

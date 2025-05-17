class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstWord = strs[0];
        for (int i=firstWord.length()-1;i>=0;i--) {
            char ch = firstWord.charAt(i);
            String prefix = firstWord.substring(0,i+1);
            Boolean isCommon = true;

            for (int j=1;j<strs.length;j++) {
                if (!strs[j].startsWith(prefix)) {
                    isCommon = false;
                    break;
                }
            }

            if (isCommon) return prefix;
        }

        return "";
    }
}

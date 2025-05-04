class Solution {
    public boolean isSubsequence(String s, String t) {
        int lastIndex = -1;
        for(int i=0;i<s.length();i++){
            int index = t.indexOf(s.charAt(i), lastIndex+1);
            if (index == -1) return false;

            lastIndex = index;
        }

        return true;
    }
}

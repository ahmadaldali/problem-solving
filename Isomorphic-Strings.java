import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sT = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char currentS = s.charAt(i);
            char currentT = t.charAt(i);
            
            boolean isMappedToDifferentValue = sT.get(currentS) != null && sT.get(currentS) != currentT;
            boolean mappedValuePresent = sT.get(currentS) == null && sT.containsValue(currentT);

            if (isMappedToDifferentValue || mappedValuePresent) {
                return false;
            }
            
            sT.put(currentS, currentT);
        }

        return true;
    }
}

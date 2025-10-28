class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> sourceCharsMap = new HashMap<>();

        for(char c: magazine.toCharArray()) {
            sourceCharsMap.put(c, sourceCharsMap.getOrDefault(c,0) + 1);
        }

        for(char c: ransomNote.toCharArray()) {
            if (!sourceCharsMap.containsKey(c)) return false;
            int freq =  sourceCharsMap.get(c);
            if (freq == 0) return false; // no enough chars in the source
            sourceCharsMap.put(c, freq-1);
        }

        return true;
    }
}

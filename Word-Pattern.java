class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> mapping = new HashMap<>();
        Set<String> wordsSet = new HashSet<>();
        
        for(int i=0;i<pattern.length();i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];
            String wordOfChar = mapping.get(currentChar);
            if (wordOfChar == null) {
                //if (mapping.values().contains(currentWord)) return false; // same word for two chars
                if (wordsSet.contains(currentWord)) return false; // same word for two chars

                mapping.put(currentChar, currentWord);
                wordsSet.add(currentWord);
            } else {
                if (!wordOfChar.equals(currentWord)) return false; // same char has two words
            }
        }

        return true;
    }
}

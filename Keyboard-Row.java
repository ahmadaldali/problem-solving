class Solution {
    private static final String firstRow = "qwertyuiop";
    private static final String secondRow = "asdfghjkl";
    private static final String thirdRow = "zxcvbnm";

    public int getCharLine(char c) {
        c = Character.toLowerCase(c);
        if (firstRow.indexOf(c) != -1) return 1;
        if (secondRow.indexOf(c) != -1) return 2;

        return 3;
    }

    public boolean hasOnLine(String word) {
        int line = getCharLine(word.charAt(0));
        for(int i=1; i < word.length();i++) {
            char c = word.charAt(i);
            if (getCharLine(word.charAt(i)) != line) return false;
        }

        return true;
    }

    public String[] findWords(String[] words) {
        boolean[] wordsHasOneLine = new boolean[words.length];
        int count = 0;
        for (int i=0;i<words.length;i++) {
            String word = words[i];
            if(hasOnLine(word)) {
                count++;
                wordsHasOneLine[i] = true;
            }
        }

        String[] result = new String[count];
        int j=0;
        for (int i=0;i<wordsHasOneLine.length;i++) {
            if(wordsHasOneLine[i]) {
                result[j] = words[i];
                j++;
            }
        }

        return result;
    }
}

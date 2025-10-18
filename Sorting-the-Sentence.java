class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] outArr = new String[words.length];
        
        for(String word: words) {
            int index = word.charAt(word.length() - 1) - '0';
	        outArr[index-1] = word.substring(0, word.length()-1);
        }
       
        return String.join(" ", outArr);
    }
}
// Time + space : O(n)

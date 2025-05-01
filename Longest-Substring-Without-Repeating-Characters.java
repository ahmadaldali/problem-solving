class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> result = new ArrayList<>();
        ArrayList<Character> left = new ArrayList<>();
        ArrayList<Character> right = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if (right.contains(currentChar)) {
                int index = right.indexOf(currentChar);
                left = new ArrayList(right.subList(0,right.size()));
                if (left.size() >= result.size()) {
                    result = new ArrayList(left);
                }

                right.add(currentChar);
                right = new ArrayList(right.subList(index+1, right.size()));

            } else {
                right.add(currentChar);
            }
        }

        if (right.size() >= result.size()) {
            result = new ArrayList(right);
        }
      
        return result.size();
    }
}

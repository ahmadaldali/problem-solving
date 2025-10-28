class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelsSet = new HashSet<>();

        for(int i=0;i<jewels.length();i++) {
            jewelsSet.add(jewels.charAt(i));
        }


        int res = 0;
        for(int i=0;i<stones.length();i++) {
            if(jewelsSet.contains(stones.charAt(i))) {
                res++;
            }
        }

        return res;
    }
}

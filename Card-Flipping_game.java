class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        HashSet<Integer> goods = new HashSet<>();
        HashSet<Integer> bads = new HashSet<>();

        for(int i=0;i<fronts.length;i++) {
            if (fronts[i] != backs[i]) {
                goods.add(fronts[i]);
                goods.add(backs[i]);
            } else {
                bads.add(fronts[i]);
                bads.add(backs[i]);
            }
        }

        int result = Integer.MAX_VALUE;
        for (Integer num : goods) {
            if (!bads.contains(num)) {
                result = Math.min(result, num);
            }
        }

        return result = result == Integer.MAX_VALUE ? 0 : result;
    }
}

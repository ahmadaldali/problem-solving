class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        if (n==0) return result;
        result[1] = 1;

        for (int i=2;i<=n;i++) {
            result[i] = result[i/2] + (i%2 == 0 ? 0 : 1);
        }

        return result;   
    }
}

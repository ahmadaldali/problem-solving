class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length < n-1) return -1;

        int[] val = new int[n];
        for(int i=0;i<trust.length;i++) {
            int a = trust[i][0];
            int b = trust[i][1];

            val[a-1]--;
            val[b-1]++;
        }

        for(int i=0;i<n;i++) {
            if (val[i] == n-1) return (i+1);
        }

        return -1;
    }
}

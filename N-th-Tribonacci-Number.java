class Solution {
    public int tribonacci(int n) {
        if (n==0) return 0;
        if(n==1 || n==2) return 1;
        int an3 = 0;
        int an2 = 1;
        int an1 = 1;

        int result = 0;
        for(int i=3;i<=n;i++) {
            result = an3+an2+an1;
            an3 = an2;
            an2 = an1;
            an1 = result;
        }

        return result;
    }
}

// time: O(n) - space O(1)

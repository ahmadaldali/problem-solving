class Solution {
    public int climbStairs(int n) {
        if (n==1 || n==2) return n;
        int last1 = 1;
        int last2 = 2;
        for (int i=3;i<=n;i++) {
            int temp = last1 + last2;
            last1 = last2;
            last2 = temp;
        }

        // Recursion = Fibonacci - exceeds the time limit
        return last2;
    }
}

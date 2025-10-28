class Solution {
    public int fib(int n) {
        if (n < 2) return n;
        
        int fN2 = 0;
        int fN1 = 1;

        for(int i=2;i<=n;i++) {
            int temp = fN1+fN2;
            fN2 = fN1;
            fN1 = temp;
        }

        return fN1;
    }
}

// Time: O(n), space: O(1)

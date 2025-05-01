class Solution {
    public int reverse(int x) {
        if (x == 0) return 0;

        int originalX = x;
        int reversed = 0;

        while (x != 0) {
            int rem = Math.abs(x % 10);
            if (reversed > Integer.MAX_VALUE / 10 || 
                (reversed == Integer.MAX_VALUE / 10 && rem > 7)) {
                // overflow
                return 0;
            }

            reversed = (reversed*10) + rem;
            x = x/10;
        }

        return originalX > 0 ? reversed : -1 * reversed;
    }
}

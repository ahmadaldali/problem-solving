class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        if (n == 2) return 1;

        int max = 0;
        int left = 0;
        int right = n-1;
        while(max == 0) {
            // check left
            if (colors[left] != colors[0]) {
                max = left;
            }

            if (colors[left] != colors[n-1]) {
                max = n-1-left;
            }

            // check right
            if (colors[right] != colors[n-1]) {
                max = n-1-right;
            }

            if (colors[right] != colors[0]) {
                max = right;
            }

            left++;
            right--;
        }

        return max;
    }
}

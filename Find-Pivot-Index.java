class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] rightSum = new int[n+1];

        int sum=0;
        rightSum[n-1] = 0;
        for(int i=0;i<n;i++) {
            sum += nums[n-1-i];
            rightSum[n-1-i] = sum;
        }

        int leftSum = 0;
        int i = 0;
        while (i<n) {
            if (leftSum == rightSum[i+1]) return i;
            leftSum += nums[i];
            i++;
        }

        return -1;
    }
}

// Time and space: O(n)

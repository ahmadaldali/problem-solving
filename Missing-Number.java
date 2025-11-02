class Solution {
    public int missingNumber(int[] nums) {
        int arraySum = 0;
        int totalSum = 0;
        for(int i=1;i<=nums.length;i++) {
            arraySum += nums[i-1];
            totalSum += i;
        }

        return totalSum-arraySum;
    }
}

// Time: O(n) - space: O(1)

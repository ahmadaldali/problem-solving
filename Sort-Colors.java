class Solution {
    public void sortColors(int[] nums) {
        int counts_0 = 0, counts_1 = 0, counts_2 = 0;

        for(int i=0;i<nums.length;i++) {
            if (nums[i] == 0) counts_0++;
            else if (nums[i] == 1) counts_1++;
            else counts_2++;
        }

        int index = 0;
        for (int i = 0; i < counts_0; i++) nums[index++] = 0;
        for (int i = 0; i < counts_1; i++) nums[index++] = 1;
        for (int i = 0; i < counts_2; i++) nums[index++] = 2;
    }
}

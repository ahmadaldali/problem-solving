class Solution {
    public boolean canJump(int[] nums) {
       boolean[] canReach = new boolean[nums.length];
       Arrays.fill(canReach, false);
       
       canReach[0] = true;
       for(int i=0;i<nums.length;i++) {
            if (canReach[i]) {
                for (int step=1;step<=nums[i];step++) {
                   if (i+step<canReach.length) canReach[i+step] = true;
                }
            } else {
                return false;
            }
       }

       return true;
    }
}

class Solution {
    public int jump(int[] nums) {
        int[] jumps = new int[nums.length];
        Arrays.fill(jumps, Integer.MAX_VALUE);
        jumps[0] = 0;
        
        int step=1;
        for(int i=0;i<nums.length;i++) {  
            for (step=1;step<=nums[i];step++) {
                if (i + step < nums.length) {
                    jumps[i + step] = Math.min(jumps[i + step], jumps[i] + 1);
                } else {
                    break;
                }
            }

            if (i + step >= nums.length) break; // no need to continue
       }
       
       return jumps[nums.length - 1];
    }
}

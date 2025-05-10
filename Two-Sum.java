import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> toBeAdded = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if (toBeAdded.get(nums[i]) != null) {   
                return new int[] { toBeAdded.get(nums[i]), i };
            }
            toBeAdded.put(target - nums[i], i);
        }

        return new int[] { 0,0 };
    }
}

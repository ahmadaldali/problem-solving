class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> myHash = new HashMap<>();
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(myHash.containsKey(nums[i])) {
                int val = myHash.get(nums[i]);
                count += val;	
                myHash.put(nums[i], val+1);
            } else {
                myHash.put(nums[i], 1);
            }
        }

        return count;
    }
}

// time + space: O(n)

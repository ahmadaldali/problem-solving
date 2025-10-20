class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxCount = 0;
        int count = 0;
        int lastItem = Integer.MIN_VALUE;
        for (int num : set) {
            if (num == lastItem+1) {
                count++;
            } else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
            lastItem = num;
        }

        return (Math.max(count, maxCount) + 1);
    }
}

// Time: O(nlog(n)) - space: O(n)

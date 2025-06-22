class Solution {
    public int[] find(int[] nums, int target, int start, int end) {
        int left = start;
        int right = end;

        if (start == end || start > end) {
            // start == end --> one element only - we check if it is target
            // start > end --> we overlapped the range --> not found
            if (start > end || nums[end] != target) {
                left = -1;
                right = -1;
            }
        } else {
            int middle = (start + end) / 2;

            if (target > nums[middle]) {
                return find(nums, target, middle + 1, end);
            }

            if (target < nums[middle]) {
                return find(nums, target, start, middle - 1);
            }

            // expand to find full range
            left = middle;
            right = middle;

            while (left > start && nums[left - 1] == target) {
                left--;
            }

            while (right < end && nums[right + 1] == target) {
                right++;
            }
        }

        int[] result = new int[2];
        result[0] = left;
        result[1] = right;

        return result;
    }

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] { -1, -1 };
        }

        return find(nums, target, 0, nums.length - 1);
    }
}

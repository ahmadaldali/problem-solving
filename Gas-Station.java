class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int index = 0;
        int lastTotal = 0;
        for(int i=0;i<gas.length;i++) {
            total += gas[i] - cost[i];
            lastTotal += gas[i] - cost[i];
            if (lastTotal < 0) {
                lastTotal = 0;
                index = (i+1 == gas.length) ? 0 : i+1;
            }
        }

        return total >=0 ? index : -1;
    }
}

// Time: O(n) - space: O(1)

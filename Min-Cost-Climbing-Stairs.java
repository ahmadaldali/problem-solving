class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int costStep0 = 0;
        int costStep1 = cost[0];

        int minCost = 0;
        for(int i=1;i<cost.length;i++) {
            minCost = cost[i] + Math.min(costStep0, costStep1);
            costStep0 = costStep1;
            costStep1 = minCost;
        }

        return Math.min(costStep0, costStep1);
    }
}

// Time: O(n) , space: O(1)

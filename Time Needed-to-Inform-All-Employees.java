class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

        int res = 0;
        for(int i=0; i < manager.length;i++) {
            int j = manager[i];
            if (graph.containsKey(j)) {
                graph.get(j).add(i);
            } else {
                graph.put(j, new ArrayList<Integer>());
                graph.get(j).add(i);
            }
        }
        res = dfs(headID, manager, informTime, graph); // call for the Headmanager

        return res;
    }

    int dfs(int head, int[] manager, int[] informTime, HashMap<Integer, ArrayList<Integer>> graph) {
        if (!graph.containsKey(head)) return 0; // just an emp.

        int max = 0;
        for (int num: graph.get(head)) { // manager and emp 
            max = Math.max(max, dfs(num, manager, informTime, graph));
        }

        return max + informTime[head];
    }
}

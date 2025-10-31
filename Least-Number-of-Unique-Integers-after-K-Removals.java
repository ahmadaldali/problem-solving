class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> counts = new HashMap<>();

        for (int i=0;i<arr.length;i++) {
            counts.put(arr[i], counts.getOrDefault(arr[i], 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(counts.values());
        while(k > 0) {
            k -= queue.poll();
        }
        
        return k == 0 ? queue.size() : queue.size()+1;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numFreq = new HashMap<>();

        // O(n)
        for (int i = 0; i < nums.length; i++) {
            numFreq.put(nums[i], numFreq.getOrDefault(nums[i], 0) + 1);
        }

        // O(n)
        List<int[]> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            list.add(new int[] {entry.getValue(), entry.getKey()});
        }

        // O(n log n)
        list.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];
        // O(k)
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i)[1];
        }
        // O(n log n) - overall time complexity
        return result;
    }
}

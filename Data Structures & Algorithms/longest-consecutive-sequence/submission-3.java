class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> numset = new HashSet<>();
        int max = 0;
        // O(n)
        for (int i = 0; i < nums.length; i++) {
            numset.add(nums[i]);
        }

        int begin = 0;
        int end = 0;
        // O(n)
        for (int num : numset) {
            if (!numset.contains(num - 1)) {
                begin = num;
                end = num;
                while (numset.contains(end + 1)) {
                    end++;
                }
                max = Math.max(max, end-begin);
            }
        }

        // overall time complexity: O(n)
        return max + 1;
    }
}

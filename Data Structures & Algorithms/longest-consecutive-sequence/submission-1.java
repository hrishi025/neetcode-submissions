class Solution {
    public int longestConsecutive(int[] nums) {
        // Bruteforce Approach
        if (nums.length < 2)
            return nums.length;

        Set<Integer> numset = new TreeSet<>();

        // addition => o(n logn)
        for (int i = 0; i < nums.length; i++) {
            numset.add(nums[i]); // each insertion O(logn)
        }

        int max = 0;
        Integer begin = null;
        int prev = 0;
        // O(n)
        for (int num : numset) {
            if(begin == null) begin = num;
            if (num == prev + 1) {
                if ((num - begin) > max)
                    max = Math.abs(num - begin);
            } else {
                begin = num;
            }
            prev = num;
        }

        // overall time complexity: O(n log n)
        return max + 1;
    }
}

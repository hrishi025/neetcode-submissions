class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> posByNum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (posByNum.get(val) != null) {
                return new int[] {posByNum.get(val), i};
            } else {
                posByNum.put(nums[i], i);
            }
        }
        return new int[0];
    }
}

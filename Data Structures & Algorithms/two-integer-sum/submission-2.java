class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> idxByNum = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            Integer val = target - nums[i];

            if (idxByNum.get(val) != null) {
                return new int[] {idxByNum.get(val), i};
            } else {
                idxByNum.put(nums[i], i);
            }
        }
        return new int[0];
    }
}

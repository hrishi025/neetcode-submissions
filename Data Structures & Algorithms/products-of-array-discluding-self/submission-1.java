class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length; // [1,2,4,6]
        int[] left = new int[size];
        int[] right = new int[size];
        int[] result = new int[size];

        left[0] = 1;
        // left array computation = [1, 1, 1*2, 1*2*4] = [1,1,2,8]
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }

        // right array computation = [2*4*6, 4*6, 6, 1] = [48,24,6,1]
        right[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // result computation [1*48,1*24,2*6,8*1] = [48,24,12,8]
        for (int i = 0; i < left.length; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}

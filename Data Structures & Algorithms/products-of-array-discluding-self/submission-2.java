class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length; // [1,2,4,6]
        int[] result = new int[size];

        result[0] = 1;
        // from left array computation = [1, 1, 1*2, 1*2*4] = [1,1,2,8]
        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }

        // [1,1,2,8]
        // from right array computation = [1*(2*4*6), 1*(4*6), 2*(6), 8*(1)] = [48,24,6,1]
        int j = 1;
        for (int i = size - 1; i >= 0; i--) {
            result[i] *= j;
            j *= nums[i];
        }

        return result;
    }
}

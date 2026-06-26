class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] left = new int[size];
        int[] right = new int[size];
        int[] result = new int[size];

        left[0] = 1;
        // left array computation
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }

        // right array computation
        right[0] = 1;
        int c = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            right[c] = nums[i + 1] * right[c - 1];
            c++;
        }

        // result computation
        int j = right.length - 1;
        for (int i = 0; i < left.length; i++) {
            result[i] = left[i] * right[j--];
        }

        return result;
    }
}

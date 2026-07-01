class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // optimal
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int value = numbers[j] + numbers[i];
            if (value < target)
                i++;
            else if (value > target)
                j--;
            else
                return new int[] {i + 1, j + 1};
        }
        return new int[] {};
    }
}

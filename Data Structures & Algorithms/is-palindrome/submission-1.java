class Solution {
    public boolean isPalindrome(String s) {
        // Optimal Solution
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !isAlphaneumeric(s.charAt(i))) {
                i++;
            }
            while (i < j && !isAlphaneumeric(s.charAt(j)) && j > 0) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public boolean isAlphaneumeric(Character c) {
        return (c <= 'Z' && c >= 'A') || (c <= 'z' && c >= 'a') || (c <= '9' && c >= '0');
    }
}

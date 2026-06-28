class Solution {
    public boolean isPalindrome(String s) {
        // Bruteforce Solution
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isAlphaneumeric(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        String s1 = sb.toString();
        // TC: O(n) ; SC: O(n)
        return s1.equalsIgnoreCase(sb.reverse().toString());
    }

    public boolean isAlphaneumeric(Character c) {
        return (c <= 'Z' && c >= 'A') || (c <= 'z' && c >= 'a') || (c <= '9' && c >= '0');
    }
}

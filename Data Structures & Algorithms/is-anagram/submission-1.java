class Solution {
    public boolean isAnagram(String s, String t) {
        //  racecar
        //  c, a, r, r, a, c, e
        // [0  0  1  0  0  0  0]
        // [0  1  1  0  0  0  0]
        // [1  1  1  0  0  0  0]
        // [1  1  1  0  0  0  1]
        // [1  1  1  0  0  1  1]
        // [1  1  1  0  1  1  1]
        // [1  1  1  1  1  1  1]
        int count = 0;
        if (t.length() == s.length()) {
            int[] visits = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                boolean found = false;
                for (int j = 0; j < t.length(); j++) {
                    if (s.charAt(i) == t.charAt(j) && visits[j] != 1) {
                        visits[j] = 1;
                        count++;
                        found = true;
                        break;
                    }
                }
                if (!found)
                    return false;
                if (count == s.length())
                    return true;
            }
        }

        return false;
    }
}

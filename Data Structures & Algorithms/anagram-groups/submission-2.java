class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        // "sortedString", ["string1", "string2"]
        // new ArrayListyvalueset

        // O(m)
        for (int i = 0; i < strs.length; i++) {
            // O(n)
            int[] chars = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                chars[strs[i].charAt(j) - 'a']++;
            }
            List<String> al = map.getOrDefault(Arrays.toString(chars), new ArrayList());
            al.add(strs[i]);
            map.put(Arrays.toString(chars), al);
        }
        return new ArrayList(map.values());
    }
}

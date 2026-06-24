class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] sarr = strs[i].toCharArray();
            Arrays.sort(sarr);
            map.computeIfAbsent(new String(sarr), k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}

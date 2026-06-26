class Solution {
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder("");
        for (String s : strs) {
            encoded.append(s.length() + "#" + s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList();
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                int size = Integer.parseInt(str.substring(j, i));
                result.add(str.substring(i + 1, i + size + 1));
                j = i + size + 1;
                i = j;
            }
        }
        return result;
    }
}

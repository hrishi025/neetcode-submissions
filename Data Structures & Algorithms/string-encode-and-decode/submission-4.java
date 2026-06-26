class Solution {
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder("");
        for (String s : strs) {
            if (s.length() == 0)
                encoded.append("0#");
            else
                encoded.append(s.length() + "#" + s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList();
        int size = 0;
        StringBuilder number = new StringBuilder("");
        StringBuilder word = new StringBuilder("");
        boolean findSize = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (findSize) {
                if (c == '#') {
                    size = i + Integer.parseInt(number.toString());
                    findSize = false;
                    if (number.toString().equals("0")) {
                        result.add(word.toString());
                        word = new StringBuilder("");
                        findSize = true;
                    }
                    number = new StringBuilder("");
                } else
                    number.append(c);
            } else if (i <= size) {
                word.append(c);
                if (i == size) {
                    result.add(word.toString());
                    findSize = true;
                    word = new StringBuilder("");
                }
            }
        }
        return result;
    }
}

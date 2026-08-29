class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (Character ch : map2.keySet()) {
            if (map2.get(ch) > map1.getOrDefault(ch, 0)) {
                return ch;
            }
        }

        return ' ';
    }
}
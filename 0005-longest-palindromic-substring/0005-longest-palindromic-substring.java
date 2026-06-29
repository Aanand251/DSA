public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        StringBuilder t = new StringBuilder("^");
        for (int i = 0; i < s.length(); i++) {
            t.append("#").append(s.charAt(i));
        }
        t.append("#$");
        char[] chars = t.toString().toCharArray();
        int[] p = new int[chars.length];
        int center = 0, right = 0;
        for (int i = 1; i < chars.length - 1; i++) {
            int mirror = 2 * center - i;
            p[i] = (right > i) ? Math.min(right - i, p[mirror]) : 0;
            while (chars[i + 1 + p[i]] == chars[i - 1 - p[i]]) p[i]++;
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }
        int maxLen = 0, centerIndex = 0;
        for (int i = 1; i < chars.length - 1; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }
        int start = (centerIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
}

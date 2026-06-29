public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128]; 
        for (int i = 0; i < 128; i++) lastIndex[i] = -1;

        int maxLen = 0, start = 0;
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (lastIndex[c] >= start) {
                start = lastIndex[c] + 1;
            }
            lastIndex[c] = end;
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}

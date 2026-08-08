class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n = s.length();
       HashMap<Character , Integer> map = new HashMap<>(n);
       for(int i = 0 ; i<n ; i++){
        char c = s.charAt(i);
        map.put(c , map.getOrDefault(c , 0)+1);
       }
      int freq = -1;
for (Character key : map.keySet()) {
    if (freq == -1) {
        freq = map.get(key);
    } else if (map.get(key) != freq) {
        return false;
    }
}
return true;
    }
}
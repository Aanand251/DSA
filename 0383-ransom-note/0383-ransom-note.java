class Solution {
    public boolean canConstruct(String r, String m) {
        int n = r.length();
        int k = m.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i<n ; i++){
            char c = r.charAt(i);
            map1.put(c, map1.getOrDefault(c , 0)+1);
        }
        for(int i = 0; i<k ; i++){
            char c = m.charAt(i);
            map2.put(c, map2.getOrDefault(c , 0)+1);
        }
        for (Character key : map1.keySet()) {

         if (!map2.containsKey(key) || map2.get(key) < map1.get(key)) {
               return false;
    }
}
           return true;
    }
}
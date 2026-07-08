class Solution {
    public int maxNumberOfBalloons(String text) {
        String s = "balloon";
         int n = text.length();
         int k = s.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i = 0; i<k ; i++){
            char c = s.charAt(i);
            map1.put(c, map1.getOrDefault(c , 0)+1);
        }
        for(int i = 0; i<n ; i++){
            char c = text.charAt(i);
            map2.put(c, map2.getOrDefault(c , 0)+1);
        }

          int count = Integer.MAX_VALUE;
        for (Character key : map1.keySet()) {
            if(!map2.containsKey(key))
                return 0;

                int possible = map2.get(key)/map1.get(key);

                count = Math.min(count
                , possible);
            
        }
        return count;

    }
}
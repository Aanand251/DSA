class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int len = 0;
        boolean odd = false ;
        HashMap<Character, Integer> map = new HashMap<>(64);
        for(int i = 0; i<n ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0)+1);
        }
        for(Character key : map.keySet()){
            
         if (map.get(key) % 2 == 0 ) {
             len += map.get(key);
        }
          else {
          len += map.get(key) - 1 ;
          odd = true;
         }
      }
     if(odd){
    len++;
   }
        return len ;
        
    }
}
class Solution {
    public int characterReplacement(String s, int k) {

        
        int low = 0;
        int res = 0;
        int n = s.length();
        int mf = 0;
        
        HashMap<Character , Integer> map = new HashMap<>();
        for(int high =0 ; high <n ; high++){
            char ch = s.charAt(high);
            map.put(ch , map.getOrDefault(ch, 0) + 1);
            mf = Math.max(mf , map.get(ch));
           
            

            while((high - low + 1) - mf > k){
                char lchar = s.charAt(low);
                map.put(lchar, map.get(lchar)-1);
                
                low++;
            }
        res = Math.max(res , high - low + 1);
        }
        return res;
    }
}
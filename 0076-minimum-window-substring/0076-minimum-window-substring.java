class Solution {
    public String minWindow(String s, String t) {

         if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character , Integer> m1 = new HashMap<>();
        HashMap<Character , Integer> m2 = new HashMap<>();

        for(char c : t.toCharArray()){
        m1.put(c, m1.getOrDefault(c, 0) + 1);
}      
     int have = 0;
     int required = m1.size();
     int low = 0;
     int start = 0;
     int minlen = Integer.MAX_VALUE;
     int n = s.length();



       for(int high=0; high<n ; high++){
        char c = s.charAt(high);
        m2.put(c , m2.getOrDefault(c,0) +1); 

        if(m1.containsKey(c) && m2.get(c).intValue() == m1.get(c).intValue()){
            have++;
        }
        while(have == required){
            if(high - low + 1 < minlen){
                minlen = high - low +1;
                start = low;
            }
            char leftchar = s.charAt(low);
            m2.put(leftchar , m2.get(leftchar)-1);

            if(m1.containsKey(leftchar) && m2.get(leftchar) <m1.get(leftchar)){
                have--;
            }
            low++;
        }
       }
       return minlen == Integer.MAX_VALUE ? "" :s.substring(start , start + minlen);


    }
}
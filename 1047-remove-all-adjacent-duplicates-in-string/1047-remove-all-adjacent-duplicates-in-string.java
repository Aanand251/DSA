class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
       Deque<Character> st = new ArrayDeque();
       for(int i =0 ; i < s.length(); i++){
         if(st.isEmpty()){
            st.push(s.charAt(i));
            continue;
         }
         if(st.peek()==s.charAt(i)){
            st.pop();
            continue;
         }
         st.push(s.charAt(i));
       }
          while(!st.isEmpty()){
        res.append(st.pop());
       }
    return res.reverse().toString();
    } 
}
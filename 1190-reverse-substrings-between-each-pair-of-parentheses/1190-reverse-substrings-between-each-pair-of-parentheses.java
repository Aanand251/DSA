class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ')'){
             st.push(ch);
            } 

            else{
                StringBuilder temp = new StringBuilder();
                while(st.peek() !='('){
                    temp.append(st.pop());
                }

                st.pop();

                for(int j =0 ; j<temp.length(); j++){
                    st.push(temp.charAt(j));
                }
            }  
        }

       for(char ch : st){
        if(ch != '(' && ch != ')'){
            sb.append(ch);
        }
       }
       return sb.toString();

    }
}
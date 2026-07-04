class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        Deque<Integer> st = new ArrayDeque<>();
        int res[] = new int[n];
        st.push(n-1);
        res[n-1] = 0;

        for(int i = n-2 ; i>=0 ; i--){
            while(!st.isEmpty() && temp[st.peek()]<=temp[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = 0;
            }
            else{
                res[i] =st.peek() - i;
            }
            st.push(i);
        }
        return res;
    }
}
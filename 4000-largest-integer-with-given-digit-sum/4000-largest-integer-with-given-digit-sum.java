class Solution {
    public int largestInteger(int n, int s) {
        if(s==0){
            return 0 ;
        }
        if(s>9*n){
            return -1;
        }
        StringBuilder str = new StringBuilder();

        for(int i = 0 ; i<n; i++){
            int num = Math.min(9,s);
            str.append(num);
            s = s - num;
        }
        return Integer.parseInt(str.toString());
    }
}
class Solution {
    int fun(int m , int n , int guess){
       int count = 0;
       for(int i = 1 ; i<=n ; i++){
        count+= Math.min(m , guess/i);
       }
       return count;
    }
    public int findKthNumber(int m, int n, int k) {
          int low = 1;
        int high = m * n; 
        int res = -1;

        while(low<=high){
            int mid = low +(high - low)/2;
            int ans = fun(m,n,mid);

            if(ans<k){
                low = mid+1;
            }
            else{
                res = mid;
                high = mid-1;
            }
        }
        return res;
    }
}
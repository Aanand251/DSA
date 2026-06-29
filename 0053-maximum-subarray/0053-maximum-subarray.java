class Solution {
    public int maxSubArray(int[] a) {
        int n = a.length;
        int bestending = a[0];
        int ans = a[0];

        for(int i=1; i<n; i++){
            int v1 = bestending + a[i];
            int v2 = a[i];
            bestending = Math.max(v1,v2);
            ans = Math.max(ans,bestending);
        }
        return ans;
    }
}
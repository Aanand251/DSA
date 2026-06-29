    class Solution {
        public int maxProduct(int[] a) {
            int n = a.length;
            int maxend = a[0];
            int minend = a[0];
            int res = a[0];
                for(int i =1 ; i<n ; i++){
            int v1 = a[i];
            int v2 = a[i]* maxend;
            int v3 = a[i]* minend;

            maxend = Math.max(v1 , Math.max(v2,v3));
            minend = Math.min(v1 , Math.min(v2,v3));
            res = Math.max(res , Math.max(maxend, minend));
        }
        return res;
        }
    }
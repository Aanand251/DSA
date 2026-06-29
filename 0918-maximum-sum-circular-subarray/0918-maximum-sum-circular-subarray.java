class Solution {
    public int maxSubarraySumCircular(int[] a) {
        int n  = a.length;
        int b1 = a[0];
        int b2 = a[0];
        int a1 = a[0];
        int a2 = a[0];
        int sum = a[0];

        for(int i = 1 ; i<n ; i++){
            sum +=a[i];

            b1 = Math.max(a[i], a[i] + b1);
            a1 = Math.max(a1 , b1);
            b2 = Math.min(a[i] , a[i] + b2);
            a2 = Math.min(a2 , b2);

        }

        if(a1<0){
            return a1;
        }
        return Math.max(a1 , sum -  a2);
    }
}
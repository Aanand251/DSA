class Solution {
    public int findMin(int[] a) {
        int n = a.length;
        int high =n-1;
        int low = 0;
        int res = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]>a[n-1]){
                low=mid+1;
            }
            else{
                res = a[mid];
                high = mid -1;
            }
        }
        return res;
    }
}
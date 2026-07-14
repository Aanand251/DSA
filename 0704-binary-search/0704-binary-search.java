class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        while(i<=j){
            int k = (i+j)/2;
            if(nums[k]==target){
                return k;
            }
            if(nums[k]<target){
                i = k+1;
            }
            if(nums[k]>target){
                j = k-1;
            }
        }
        return -1;
    }
}
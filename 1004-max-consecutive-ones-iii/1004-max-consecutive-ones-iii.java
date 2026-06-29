class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int res = 0;
        int n = nums.length;
        int z = 0;
       


       for(int r =0 ; r <n ; r++ ) {
        if(nums[r]==0){
            z++;
        }
       
        if(z>k){
            if(nums[l]==0)
                z--;
            
            l++;
        }
        res = Math.max(res , r - l + 1);
       }
       return res;


    }
}
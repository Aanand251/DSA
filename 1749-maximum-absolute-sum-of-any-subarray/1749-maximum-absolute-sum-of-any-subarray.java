class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int bestending1 = nums[0];
        int bestending2 = nums[0];
        int n = nums.length;
        int ans1 = nums[0];
        int ans2 = nums[0];
        

        for(int i = 1 ; i<n ; i++){
            bestending1 = Math.max(nums[i] , nums[i] + bestending1);
            ans1 = Math.max(ans1 , bestending1);
              
            bestending2 = Math.min(nums[i] , nums[i] + bestending2);
            ans2 = Math.min(ans2 , bestending2);

          
           
        }
         return Math.max(ans1, Math.abs(ans2));
    }
}
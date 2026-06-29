class Solution {
        public int missingNumber(int[] nums) {
              
                int n = nums.length;
               //  Arrays.sort(nums);
                     int result;
                                       
                     for(int i =0 ; i<nums.length ; i++){
                         
                      n = n^i^nums[i];

                         }
                         return n;
                      }
}
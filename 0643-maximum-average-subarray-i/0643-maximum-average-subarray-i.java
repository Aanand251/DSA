class Solution {
    public double findMaxAverage(int[] nums, int k) {
   int sum =0;
   for(int i = 0; i<k; i++){
    sum += nums[i];
   }
   int maxsum = sum;
   int high = k;
   int low = 0;
   int n = nums.length;

   while(high<n){
    sum += nums[high];
    sum -= nums[low];
    maxsum = Math.max(maxsum , sum);

    high++;
    low++;
       }
       return (double)maxsum/k;

    }
}
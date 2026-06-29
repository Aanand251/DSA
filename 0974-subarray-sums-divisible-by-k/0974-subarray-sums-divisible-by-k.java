class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n  = nums.length;
        int ans = 0;
        int sum = 0;

        HashMap<Integer , Integer> map = new HashMap<>(k);
         map.put(0,1);

         for(int i=0 ; i<n ; i++){
            sum += nums[i];
           int rem = sum%k;
           if(rem<0){
            rem = rem+k;
           }
          int freq = map.getOrDefault(rem, 0);
          ans += freq;
           map.put(rem, freq + 1);
          }
return ans;
}
}
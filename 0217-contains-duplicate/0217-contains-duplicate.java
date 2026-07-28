class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
             int j = i+1;
             while(i<j && j<=n-1){
        if(nums[i]==nums[j]){
                return true;
             }
             else{
                i++;
                j++;
             }
             }
             
        }
        return false;
    }
}
class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int zero = 0;
        int one = 0;
        HashMap<Integer , Integer> map  = new HashMap<>(n); 
        map.put(0, -1);
    int res = 0;

    for(int i = 0; i<n ; i++){
        if(nums[i]==0)
        zero++;
        else one++;

        int diff = zero - one;
        if(map.containsKey(diff)){
            int idx = map.get(diff);
            int len = i - idx;
            res = Math.max(res , len);
            }
            else{map.put(diff , i);
            }
            
 }
        return res;

          }
}
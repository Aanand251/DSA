class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap(n);

        for(int num:nums){
            if(map.containsKey(num)){
                return true;
            }
            map.put(num , map.getOrDefault(num, 0)+1);
        }
        return false;
    }
}
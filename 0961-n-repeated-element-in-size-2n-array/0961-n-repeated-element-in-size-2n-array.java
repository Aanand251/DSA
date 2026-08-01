class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>(n);
      for(int i:nums){
        map.put(i ,  map.getOrDefault(i , 0)+1);
        if(map.get(i)==2){
            return i;
        }
      }
     return -1;
    }
}
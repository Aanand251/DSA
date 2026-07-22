class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>(n);

        for(int i:nums){
            map.put(i , map.getOrDefault(i , 0)+1);
        }
        int res = -1;
        int maxFreq = 0;
        for (int key : map.keySet()) {
    if (map.get(key) > maxFreq) {
        maxFreq = map.get(key);
        res = key;
    }
}

         return res;

    }
}
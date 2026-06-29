class Solution {
    public int totalFruit(int[] fruits) {
         
     int k = 2;
       int low = 0;
       int n = fruits.length;
       int res = 0;
       HashMap<Integer , Integer> map = new HashMap<>();

       for(int high = 0 ; high<n ; high++){
          map.put(fruits[high] ,map.getOrDefault(fruits[high], 0)+1);

          while(map.size()>k){
            map.put(fruits[low] , map.get(fruits[low]) -1);

            if(map.get(fruits[low])==0){
                map.remove(fruits[low]);
            }
            low++;
          }
          if(map.size()<=k){
            res = Math.max(res, high - low + 1);
          }

       }
       return res;
      


    }
}
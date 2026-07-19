class Solution {
      long fun(int[] piles, int speed) {
        long hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += piles[i] / speed;
            if (piles[i] % speed != 0) {
                hours++;
            }
        }
         return  hours;
      }
    public int minEatingSpeed(int[] piles, int h) {
    int n = piles.length;
    int max = 0;
    for(int i = 0; i<n ; i++){
        max = Math.max(max, piles[i]);
    }
   int low = 1;
   int high = max;
   int res = -1;

   while(low<=high){
    int mid = low +(high-low)/2;
    long hour = fun(piles , mid);
    if(hour>h){
        low = mid + 1;
    }
    else{
        res = mid;
        high = mid - 1;
    }
   }
   return res;
}
}
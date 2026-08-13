class Solution {
    class pair{
        int first;
        int second;
        pair(int f , int s ){
            this.first = f;
            this.second = s;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
         int n  = nums.length;
       PriorityQueue<pair> pq = new PriorityQueue<>
        ((a,b) ->{
            if(a.first != b.first)
            return Integer.compare(a.first, b.first);
            return Integer.compare(a.second, b.second);
        });

        HashMap<Integer , Integer> map = new HashMap<>(n);
        for(int i:nums){
            map.put(i , map.getOrDefault(i , 0)+1);
        }
         for (Integer key : map.keySet()){
            int element = key;
            int freq = map.get(key);
            pair curr = new pair(freq , element);
            if(pq.size()<k){
                pq.add(curr);
                continue;
            }
            if(curr.first > pq.peek().first){
                pq.poll();
                pq.add(curr);
            }
         }
         int res[] = new int[k];
         int i = 0;
         while(!pq.isEmpty()){
            res[i++] = pq.peek().second;
            pq.poll();
         }
        return res;
    }
}
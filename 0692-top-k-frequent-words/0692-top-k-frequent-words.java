class Solution {
    class pair{
        int first;
        String second;
        pair(int f , String s){
            this.first = f;
            this.second = s;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
       int n = words.length;
       PriorityQueue<pair> pq = new PriorityQueue<>
       ((a,b) ->{
            if(a.first != b.first)
                return a.first - b.first;
                return b.second.compareTo(a.second);
        });
       HashMap<String , Integer> map = new HashMap<>(k);
       for(int i =0 ; i<n ; i++){
        String c = words[i];
        map.put(c , map.getOrDefault(c , 0)+1);
       } 
      for(String key:map.keySet()) {
        String character = key ;
        int freq = map.get(key);
        pair curr = new pair(freq , character);
        pq.add(curr);
        if(pq.size() > k)
        pq.poll();
        }
      List<String> res = new ArrayList();
      while(!pq.isEmpty()){
       res.add(0 , pq.peek().second);
       pq.poll();
      }
      return res;
    }
}
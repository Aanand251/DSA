class Solution {
    public int distributeCandies(int[] a) {
        int n = a.length;
        int limitation = n/2;
        HashMap<Integer, Integer> map = new HashMap<>(n);
        for(int i:a){
         map.put(i , map.getOrDefault(i, 0)+1);
        }
        int unique = map.size();

        return Math.min(unique, limitation);
    }
}
class Solution { 
    class pair { 
        char letter; 
        int freq; 

        pair(char letter, int freq) { 
            this.letter = letter; 
            this.freq = freq; 
        } 
    } 

    public String reorganizeString(String s) { 
        HashMap<Character, Integer> map = new HashMap<>(s.length()); 

        Comparator<pair> comparator = (a, b) -> { 
            return b.freq - a.freq; 
        }; 

        PriorityQueue<pair> pq = new PriorityQueue<>(comparator); 

        for(int i = 0; i < s.length(); i++) { 
            char c = s.charAt(i); 
            map.put(c, map.getOrDefault(c, 0) + 1); 
        } 

        StringBuilder sb = new StringBuilder(); 

        for(Map.Entry<Character, Integer> entry : map.entrySet()) { 
            pq.offer(new pair(entry.getKey(), entry.getValue())); 
        } 

        while(pq.size() >= 2) { 
            pair firstpoll = pq.poll(); 
            pair secondpoll = pq.poll(); 

            sb.append(firstpoll.letter); 
            sb.append(secondpoll.letter); 

            firstpoll.freq--; 
            secondpoll.freq--; 

            if(firstpoll.freq > 0) { 
                pq.add(firstpoll); 
            } 

            if(secondpoll.freq > 0) { 
                pq.add(secondpoll); 
            } 
        } 

        if(!pq.isEmpty()) { 
            pair lastpoll = pq.poll(); 

            if(lastpoll.freq > 1) { 
                return ""; 
            } 

            if(sb.length() > 0 && sb.charAt(sb.length() - 1) == lastpoll.letter) { 
                return ""; 
            } 

            sb.append(lastpoll.letter); 
        } 

        return sb.toString(); 
    } 
}
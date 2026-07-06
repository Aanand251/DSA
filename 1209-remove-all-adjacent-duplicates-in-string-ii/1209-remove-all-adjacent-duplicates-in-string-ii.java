import java.util.*;
class Pair {
    char ch;
    int freq;
    Pair(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
}

class Solution {
public String removeDuplicates(String s, int k) {

        Deque<Pair> st = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (st.isEmpty() || st.peek().ch != c) {
                st.push(new Pair(c, 1));

            } else {
                Pair p = st.peek();
                p.freq++;

                if (p.freq == k) {
                    st.pop();
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            Pair p = st.removeLast();
            for (int i = 0; i < p.freq; i++) {
                ans.append(p.ch);
            }
        }

        return ans.toString();
    }
}
public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE; 

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int result = 0;
        for (int i = 31; i >= 0; i--) {
            if ((dvd >> i) >= dvs) {
                dvd -= (dvs << i);
                result += 1 << i;
            }
        }
        return ((dividend ^ divisor) >> 31) == 0 ? result : -result;
    }
}

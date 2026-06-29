class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();

        // Step 1: Ignore leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // If string is only spaces
        if (i == n) return 0;

        // Step 2: Detect sign
        int sign = 1;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        long value = 0;  // use long to detect overflow

        // Step 3: Skip leading zeros
        while (i < n && s.charAt(i) == '0') {
            i++;
        }

        // Step 3: Read digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            value = value * 10 + (s.charAt(i) - '0');

            // Step 4: Handle overflow
            if (sign == 1 && value > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -value < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(value * sign);
    }
}

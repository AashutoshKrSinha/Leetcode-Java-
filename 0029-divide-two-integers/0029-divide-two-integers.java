class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        for (int shift = 31; shift >= 0; shift--) {

            if (a >= (b << shift)) {
                a -= (b << shift);
                result += (1 << shift);
            }
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            result = -result;
        }

        return result;
    }
}
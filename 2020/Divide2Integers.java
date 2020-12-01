//O(n) time and O(1) space
class Solution {
    public int divide(int dividend, int divisor) {
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
        return Integer.MAX_VALUE;
    }
    int neg = 0;
    if (dividend < 0) {
        neg++;
        dividend = -dividend;
    }
    if (divisor < 0) {
        neg++;
        divisor = -divisor;
    }

    int subtract = 0;
    while (dividend - divisor >= 0) {
        subtract++;
        dividend -= divisor;
    }
    if (neg == 1) {
        subtract = -subtract;
    }

    return subtract;
}
}
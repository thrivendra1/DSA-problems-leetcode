class Solution {
    public int mySqrt(int x) {
        // return (int)Math.sqrt(x);
         if (x == 0 || x == 1) {
            return x;
        }

        long left = 1;
        long right = x;
        long result = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                left = mid + 1;
                result = mid; // Update the result for the floor value
            } else {
                right = mid - 1;
            }
        }

        return (int) result;
    }
}
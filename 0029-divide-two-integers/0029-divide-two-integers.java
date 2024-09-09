class Solution {
    public int divide(int dividend, int divisor) {
        int n = 0;
        long c = 0;
        boolean sign = true;
        if (divisor == dividend) return 1;
        if ((dividend < 0 && divisor >= 0) || (dividend >= 0 && divisor < 0))
        {
            sign = false;
        } 
        long dd = Math.abs((long) dividend);
        long dr = Math.abs((long) divisor);
        // for (int i = 30; i >= 0; i--) {
        //     if (dd >= (dr << i)) {
        //         c += (1 << i);
        //         dd -= (dr << i);
        //     }
        // }
        // return (int) (c * sign);
        int ans=0;
        while(dd>=dr)
        {
            int count=0;
            while(dd>=(dr<<(count+1)))
            {
                count++;
            }
            ans+=1<<count;
            dd-=(dr<<count);
        }
        if(ans==(1<<31) && sign)
        {
            return Integer.MAX_VALUE;
        }
        if(ans==(1<<31) && !sign)
        {
            return Integer.MIN_VALUE;
        }
        return sign?ans:-ans;
    }
}
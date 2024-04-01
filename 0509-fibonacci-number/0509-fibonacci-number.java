class Solution {
    public int fib(int n) {
        if(n<=1)
        {
            return n;
        }
        int f1=0;
        int f2=1;
        int ans=0;
        
        for(int i=0;i<n;i++)
        {
            ans=f1+f2;
            f1=f2;
            f2=ans;
        }
        return f1;
        
    }
}
class Solution {
    public int fib(int n) {

        
        // Apporeach-1 
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
        

        // Apporach-2 we are using recursion

        // if(n<=1)
        // {
        //     return n;
        // }
        // int flast=fib(n-1);
        // int slast=fib(n-2);
        // return flast+slast;
        
    }
}
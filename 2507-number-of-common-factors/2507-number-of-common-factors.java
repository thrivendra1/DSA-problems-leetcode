class Solution {
    public int commonFactors(int a, int b) {
        int length=0;
        int count=0;
        if(a<b)
        {
            length=b;
        }
        else if(a>b)
        {
            length=a;
        }
        else
        {
            length=a;
        }
        for(int i=1;i<=length;i++)
        {
            if(a%i==0 && b%i==0)
            {
                count++;
            }
        }
        return count;
    }
}
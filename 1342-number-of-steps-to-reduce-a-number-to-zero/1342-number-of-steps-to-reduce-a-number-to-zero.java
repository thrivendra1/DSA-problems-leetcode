class Solution {
    public int numberOfSteps(int num) {
        return helperFucntion(num,0);
    }

    public static int helperFucntion(int n, int steps)
    {
        if(n==0)
        {
            return steps;
        }

        if(n%2==0)
        {
            return helperFucntion(n/2,steps+1);
        }
return helperFucntion(n-1,steps+1);
    }
}
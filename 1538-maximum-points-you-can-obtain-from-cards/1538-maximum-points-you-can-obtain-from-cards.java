class Solution {
    public int maxScore(int[] cardPoints, int k) 
    {
        int maxsum=0;

        int lsum=0,rsum=0;

        // creating a window

        for(int i=0;i<k;i++)
        {
            lsum+=cardPoints[i];
            maxsum=lsum;
        }
        System.out.println(maxsum);
        int rearend=cardPoints.length-1;

        for(int i=k-1;i>=0;i--)
        {
            lsum=lsum-cardPoints[i];

            rsum=rsum+cardPoints[rearend];

            rearend--;

            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
    
}
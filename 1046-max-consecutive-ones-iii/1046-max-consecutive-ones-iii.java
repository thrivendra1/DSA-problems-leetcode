class Solution {
    static public int longestOnes(int[] nums, int k)
    {
        /* Apporach-1
        int maxlength=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            int n=k;
            int length=0;

            for(int j=i;j<nums.length;j++)
            {

                if(nums[j]==1)
                {
                    length++;
                }
                else if(nums[j]==0)
                {
                    if(n>0)
                    {
                        length++;
                        n--;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            maxlength=Math.max(maxlength,length);

        }
        return maxlength;
        */

        int maxlength=0,l=0,r=0,length=0,zeros=0;

        while(r<nums.length)
        {
            if(nums[r]==0) zeros++;

            if(zeros>k)
            {
                if(nums[l]==0) zeros--;
                l++;
            }

            if(zeros<=k)
            {
                length=r-l+1;
                maxlength=Math.max(maxlength,length);
            }
            r++;
        }
        return maxlength;

    }
}
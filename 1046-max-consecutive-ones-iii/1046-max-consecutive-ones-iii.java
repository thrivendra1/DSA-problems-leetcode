class Solution {
    static public int longestOnes(int[] nums, int k)
    {
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

    }
}
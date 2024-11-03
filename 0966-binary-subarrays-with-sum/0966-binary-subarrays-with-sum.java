class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
 /*       int max=0;

        for(int i=0;i<nums.length;i++)
        {
            int sum=0;

            for(int j=i;j<nums.length;j++)
            {
                sum=sum+nums[j];

                if(sum==goal)
                {
                    max++;
                }
            }
        }
        return max;
        */

    // using sliding window

    int ans=subarrays(nums,goal)-subarrays(nums,goal-1);
    return ans;
        
    }

    static int subarrays(int []nums,int goal)
    {
        if(goal<0) return 0;
        int sum=0,count=0,l=0,r=0;

        while(r<nums.length)
        {
            sum=sum+nums[r];

            while(sum>goal)
            {
                sum=sum-nums[l];
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
}
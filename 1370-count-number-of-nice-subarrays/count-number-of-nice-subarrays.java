class Solution {
    public int numberOfSubarrays(int[] nums, int k) 
    {
        // int count=0;

        // for(int i=0;i<nums.length;i++)
        // {

        //     int odd=0;

        //     for(int j=i;j<nums.length;j++)
        //     {
        //         if(nums[j]%2!=0)
        //         {
        //             odd++;
        //         }
        //         if(odd==k)
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;
        int ans=subarrays(nums,k)-subarrays(nums,k-1);
        return ans;
        
    }
    static int subarrays(int []nums,int goal)
    {
        if(goal<0) return 0;
        int sum=0,count=0,l=0,r=0;

        while(r<nums.length)
        {
            sum=sum+(nums[r]%2);

            while(sum>goal)
            {
                sum=sum-(nums[l]%2);
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
}
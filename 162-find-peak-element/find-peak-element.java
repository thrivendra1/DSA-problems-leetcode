class Solution {
    public int findPeakElement(int[] nums) {
        /* 
        LINEAR SEARCH
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>ans)
            {
                ans=i;
            }
        }
        return ans;
        */
        if(nums.length-1==0)
        {
            return 0;
        }
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;

        int low=1,high=nums.length-2;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            else if(nums[mid]>nums[mid-1])
            {
                low=mid+1;
            }
            // else if(nums[mid]>nums[mid+1])
            // {
            //     high=mid-1;
            // }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }
}
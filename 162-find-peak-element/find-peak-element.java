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

        // using binary serach

        if(nums.length==1 || nums[0]>nums[1])
        {
            return 0;
        }

        else if(nums[nums.length-1]>nums[nums.length-2])
        {
            return nums.length-1;
        }


        int low=1,high=nums.length-2;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
            {
                return mid;
            }
            else if(nums[mid]>nums[mid-1])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }
}
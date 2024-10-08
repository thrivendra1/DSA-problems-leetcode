class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length-1;
        int low=0;
        int high=n;

        while(low<=high)
        {
            // int mid=low+(high-low)/2;
            int mid=(low+high)/2;

            if(nums[mid]==target)
            {
                return mid;
            }
            
            if(nums[low]<=nums[mid])
            {
                if(nums[low]<=target && target<=nums[mid])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else
            {
                if(nums[mid]<=target && target<=nums[high])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
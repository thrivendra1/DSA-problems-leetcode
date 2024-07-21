class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        int x=target;
        int low=0,high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                first=mid;
            }
            if(nums[mid]>=target)
            {
                
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        if(first!=-1)
        {
        low=0;
        high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                last=mid;
            }
            if(target>=nums[mid])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        }
        System.out.print(first);
        int arr[]={first,last};
        return arr;
    }
}
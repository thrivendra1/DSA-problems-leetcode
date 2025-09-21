class Solution {
    public int search(int[] nums, int target) {
        int high=nums.length-1;
        int low=0;


        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(nums[mid]==target)
            {
                return mid;
            }

            // In normal array we can decided to move left or right 
            // but this problem they say was distict so we have to check the target was in left side of right side

            // checking the left to mid was sorted array

            if(nums[low]<=nums[mid])
            {
                //we know the left array was sorted so we can check the targert weas in left side array

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
                if(target>=nums[mid] && target<=nums[high])
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
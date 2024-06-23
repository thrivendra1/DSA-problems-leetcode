class Solution {
    public boolean search(int[] nums, int target) {
        /*
        Apporch 1: unsing sorting then use binary serach
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target) return true;
            
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        */

        // Approach 2 : only using binary serach

        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]==target)
            {
                return true;
            }
            if(nums[low]==nums[mid] && nums[mid]==nums[high])
            {
                low++;
                high--;
                continue;
            }

            //left sorted

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
        return false;
    }
}

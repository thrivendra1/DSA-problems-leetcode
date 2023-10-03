class Solution {
    public int search(int[] nums, int target) {


        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==target)
        //     {
        //         return i;
        //     }
        // }


            // O(log n) apporach
            
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            // left side sort
            if(nums[low]<=nums[mid])
            {
                if(nums[low]<=target && nums[mid]>target)
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            // rigth side sort
            
            else
            {
                if(nums[mid]<target && nums[high]>=target)
                {
                    low=mid+1;

                }
                else
                {
                    high=mid-1;
                }
            }
        }


   
          return -1 ;
    } 
}
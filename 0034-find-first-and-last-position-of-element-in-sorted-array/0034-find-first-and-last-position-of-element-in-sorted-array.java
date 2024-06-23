class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }
    public int findFirst(int[] nums, int target)
    {
        int idx=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                idx=mid;
            }
            if(nums[mid]>=target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
         /*   if(nums[start]==target)
            {
                idx=start;
                break;
            }
            start++;
            */
        }
        return idx;
    }
       
        
        public int findLast(int[] nums, int target)
    {
        int idx=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {

            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                idx=mid;
            }
            if(target>=nums[mid])
            {
                start=mid+1;
                // start=mid+1;
            }
            else
            {
                
                end=mid-1;
            }
        }
       
        return idx;
    }



}
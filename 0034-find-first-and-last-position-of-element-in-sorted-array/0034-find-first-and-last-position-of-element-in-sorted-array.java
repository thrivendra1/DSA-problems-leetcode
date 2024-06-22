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

            // int i=(start+end)/2;
            // if(nums[i]==target)
            // {
            //     idx=i;
            // }
            // if(nums[i]>=target)
            // {
            //     end=i-1;
            // }
            // else
            // {
            //     start=i+1;
            // }
            if(nums[start]==target)
            {
                idx=start;
                break;
            }
            start++;


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

            int i=(start+end)/2;
            if(nums[i]==target)
            {
                idx=i;
            }
            if(nums[i]<=target)
            {
                start=i+1;
            }
            else
            {
                
                end=i-1;
            }
        }
       
        return idx;
    }



}
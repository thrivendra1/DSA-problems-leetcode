class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             return nums[i];
                    
        //         }
        //     }
        // }
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=nums[i+1])
            {
                return nums[i];
            }
        }
        return 0;
    }
}
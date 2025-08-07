class Solution {
    public int[] rearrangeArray(int[] nums) {
        int array[]=new int[nums.length];

        int postiveindex=0;
        int negitiveindex=1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                array[postiveindex]=nums[i];
                postiveindex=postiveindex+2;
            }
            else
            {
                array[negitiveindex]=nums[i];
                negitiveindex=negitiveindex+2;
            }
        }
        return array;
    }
}
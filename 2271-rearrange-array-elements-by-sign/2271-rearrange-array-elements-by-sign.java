class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length/2;
        int positive[]=new int[n];
        int negative[]=new int[n];
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                positive[a++]=nums[i];
            }
            else
            {
                negative[b++]=nums[i];
            }
        }
        int k=0;
        for(int j=0;j<nums.length/2;j++)
        {
            nums[k]=positive[j];
            k++;
            nums[k]=negative[j];
            k++;
        }
        return nums;
    }
}
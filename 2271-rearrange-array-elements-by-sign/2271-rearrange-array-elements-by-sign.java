class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length/2;
        int positive []=new int[n];
        int negative[]=new int[n];
        int pi=0;
        int ni=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                positive[pi]=nums[i];
                pi++;
                
            }
            else
            {
                negative[ni]=nums[i];
                    ni++;
            }
        }

        int k=0;
        int l=0;
        int m=0;
        for(int i=0;i<nums.length/2;i++)
        {
            nums[m++]=positive[k];
            k++;
            nums[m++]=negative[l];
            l++;
            
        }
        return nums;
    }
}
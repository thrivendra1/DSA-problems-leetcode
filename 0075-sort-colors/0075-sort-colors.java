class Solution {
    public void sortColors(int[] nums) {
       
    //    Arrays.sort(nums);
    // another approch
    int color0=0;
    int color1=0;
    int color2=0;

    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==0)
        {
            color0++;
        }
        if(nums[i]==1)
        {
            color1++;
        }
        if(nums[i]==2)
        {
            color2++;
        }
    }
    for(int i=0;i<color0;i++)
    {
         nums[i]=0;
    }  
    for(int i=color0;i<color0+color1;i++)
    {
        nums[i]=1;
    }     
       for(int i=color1+color0;i<color1+color2+color0;i++)
    {
        nums[i]=2;
    }   
    }
}
class Solution {
    public void nextPermutation(int[] nums) {
        
        int firstnumber=-1;
        int secondnumber=-1;

        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i+1]>nums[i])
            {
                firstnumber=i;
                break;
            }
        }

        if(firstnumber==-1)
        {
            reverse(nums,0);
        }
        else
        {
            for(int i=nums.length-1;i>=0;i--)
            {
                if(nums[i]>nums[firstnumber])
                {
                    secondnumber=i;
                    break;
                }
            }

            swap(nums,firstnumber,secondnumber);

            reverse(nums,firstnumber+1);
        }
    }

    public void swap(int []nums,int f,int s)
    {
        int temp=nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }

    public void reverse(int [] nums,int i)
    {
        int start=i;
        int last=nums.length-1;

        while(start<last)
        {
            int temp=nums[start];
            nums[start]=nums[last];
            nums[last]=temp;
            start++;
            last--;
        }
    }
}
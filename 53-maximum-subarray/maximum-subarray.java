class Solution {
    public int maxSubArray(int[] nums) {
//         int largest=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=i;j<nums.length;j++)
//             {
//                 int sum=0;
//                 for(int k=i;k<=j;k++)
//                 {
//                     sum=sum+nums[k];

//                 }
//                 largest=Math.max(sum,largest);
//             }
//         }
//         return largest;
        
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
        
    }
}
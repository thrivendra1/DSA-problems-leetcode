class Solution {
    public int maxSubArray(int[] nums) {
		// ------------------------ this brute force apporach ---------------------------------------
    //     int max=Integer.MIN_VALUE;
    //     int n=nums.length;
    //     for(int i=0;i<n;i++)
		// 		{
		// 		for(int j=i;j<n;j++)
		// 		{
		// 		int sum=0;
		// 		for(int k=i;k<=j;k++)
		// 		{
		// 			sum+=nums[k];
		// 		}
		// 		max=Math.max(max,sum);
		// 	}
		// }
		// return max;




		// -------------------------kadanes alogrithm---------------------------------------------
		
				// we take leasr min valuese(-21535468  this VALUE was assumption)

				int max=Integer.MIN_VALUE;
				// this sum using was store or add the arr values
				int sum=0;

				for(int i=0;i<nums.length;i++)
				{

					// we are adding the numbers
					sum+=nums[i];

					//  checking the sum is greater than the max and we assign the "sum values to max "
					if(sum>max)
					{
						max=sum;
					}
					// we checking the sum is negative or not 
					if(sum<0)
					{
						sum=0;
					}
				}
				return max;
    }
}
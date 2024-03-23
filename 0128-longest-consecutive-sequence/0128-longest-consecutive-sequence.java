class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
       if(n==0) return 0;

//        // we intizial a small numer 
//         int lastsmall=Integer.MIN_VALUE, count=0,b=1;
        
//         for(int i=0;i<n;i++)
//         {
//             // checking the lastsmall number with arr[i] 
//             if(lastsmall+1!=nums[i] && lastsmall!=nums[i])
//             {
//                 count=1;
//                 lastsmall=nums[i];
//             }
//             System.out.println(lastsmall);
//             if(lastsmall+1==nums[i])
//             {
//                 count++;
//                 lastsmall=nums[i];
//             }
//             // System.out.println(lastsmall);
//             b = Math.max(b, count);
//             System.out.println("b "+b);
//         }
// //        return b;
//         int count=0;
//         int nu=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]>=0){
            
//             if(i<nums.length-1)
//             {
//              nu=nums[i]-nu;
//             }
//             if(nu==1)
//             {
//                 count++;
//             }
//             }
//         }
//         System.out.println(count);
//         return count+1;
        int current_length=1;
        int max_length=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                if(nums[i]== nums[i-1]+1)
                {
                    current_length++;   
                }
                else
                {
                    current_length=1;
                }
            }
            max_length=Math.max(max_length,current_length);
        }
        System.out.println(max_length);
        return max_length;
    }
}
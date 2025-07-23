class Solution {
    public boolean check(int[] nums) {
        // int n=0;
        // for(int i=1;i<=nums.length-1;i++)
        // {
        //     if(nums[i] < nums[i-1]){
        //         n++;
        //     }
        // }
        // if(n>1)
        // {
        //     return false;
        // }
        // return true;
//         int array[]=nums.clone();
//         int size=array.length;
//             for(int i=0;i<size-1;i++)
//             {
//                 for(int j=0;j<size-i-1;j++)
//                 {
//                     if(array[j]>array[j+1])
//                     {
//                         int temp=array[j];
//                         array[j]=array[j+1];
//                         array[j+1]=temp;
//                     }
//                 }
//             }
//                 int count=0;
        
//             for(int i=0;i<size;i++)
//             {
//                 if(nums[i]!=array[i])
//                 {
//                     count++;
//                 }
//             }
        
//         if(count>1)
//         {
//             return false;
//         }
    
//         return true;
        int count=0;
        int index=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                count++;
                index=i;
            }
        }
        if(count>1){
            return false;
        }
        if(count==1){
            if(nums[n-1]>nums[0]){
                return false;
            }
        }
        return true;
    }
}
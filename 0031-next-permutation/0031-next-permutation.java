// class Solution {
//     public void nextPermutation(int[] nums) 
//     {
        
//         int n=nums.length;
        
//         // STEP 1 : Find the break point
        
//         int index=-1; // we use this index to store "break point" index number
        
//         // we get the breakp point in this loop
        
//         for(int i=n-2;i>0;i--)
//         {
//             if(nums[i]<nums[i+1])
//             {
//                 index=i;
//                 break;
//             }
//         }
        
//         // if break point doesn't exist in the array
//         if(index==-1)
//         {
//             /* we reversing the array beacuse we not get any break point 
//              if there is no break point we can say that the given array is the last permutation 
//             thats why we should move the first permutation */
            
            
//             for(int i=0;i<n-1;i++)
//             {
//                 for(int j=0;j<n-i-1;j++)
//                 {
//                     if(nums[j]<nums[j+1])
//                     {
//                         int temp=nums[j+1];
//                         nums[j+1]=nums[j];
//                         nums[j]=temp;
//                     }
//                 }
//             }
            
            
//             // Step 2: Find the next greater element and swap it with nums[index]
            
//             for(int i=n-1;i>index;i--)
//             {
//                 if(nums[i]>nums[index])
//                 {
//                     int temp=nums[i];
//                     nums[i]=nums[index];
//                     nums[index]=temp;
//                     break;
//                 }
//             }
            
//             // step 3 reverse the rest right half
//              reverse(nums,index+1);
            
            
            
//         }
        
//         }
    
//     void reverse(int[] nums,int start)
//     {
//         int i=start;
//         int j=nums.length-1;
//         while(i<j){
//             swap(nums,i,j);
//             i++;
//             j--;
//              }
    
//     }
//         void swap(int[] nums,int i,int j)
//         {
//         int temp=nums[i];
//         nums[i]=nums[j];
//         nums[j]=temp;
//          }
// }
      
class Solution {
    public void nextPermutation(int[] nums) {
        int ind1=-1;
        int ind2=-1;
        // step 1 find breaking point 
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        // if there is no breaking  point 
        if(ind1==-1){
            reverse(nums,0);
        }
        
        else{
            // step 2 find next greater element and swap with ind2
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
            }

            swap(nums,ind1,ind2);
            // step 3 reverse the rest right half
            reverse(nums,ind1+1);
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
        
    

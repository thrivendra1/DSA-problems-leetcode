class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
 


        int l1=m-1,l2=n-1;
        int right=m+n-1;

        while(l1>=0 && l2>=0)
        {
            if(nums1[l1] > nums2[l2])
            {
                
                nums1[right]=nums1[l1];
               
                l1--;
                
                
            }
            else 
            {
                nums1[right]=nums2[l2];
                l2--;
               
            }
                right--;
        }

        while(l2>=0)
        {
             nums1[right]=nums2[l2];
             l2--;
             right--;
             
        }


        // ------------ the below code was same concelpt of the above but it has less code and remaing was same

            // assing two pointer approach using left and rigth
        // int l1=m-1,l2=n-1;  // left was using to check numbers which one is bigger
        // int r=m+n-1; // rigth was using to store the number

        // while(l1>=0 && l2>=0)  // Merge from the back while both arrays have elements left
        // {
        //     if(nums1[l1]>nums2[l2])  // chcekcing the nums1 are greater then nums2
        //     {
        //         nums1[r]=nums1[l1];
        //         l1--;
        //     }
        //     else   // oppsite of the if condition
        //     {
        //         nums1[r]=nums2[l2];
        //         l2--;
        //     }
        //     r--;
        // }
        // while(l2>=0)  // adding the remaing numbers in nums2 array into nums1 
        // {
        //     nums1[r]=nums2[l2];
        //     l2--;
        //     r--;
        // }
    }
}
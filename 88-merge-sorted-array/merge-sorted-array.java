class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //    if(m==1 && n==0)
        //    {
        //         nums1[0]=nums1[0];
        //    }
        //    if(n==1 && m==0)
        //    {
        //     nums1[0]=nums2[0];
        //    }


        // int l1=m,l2=n;
        // int right=nums1.length-1;

        // while(l1>0 && l2>0)
        // {
        //     if(nums1[l1-1] > nums2[l2-1])
        //     {
        //         int temp=nums1[right];
        //         nums1[right]=nums1[l1-1];
        //         nums1[l1-1]=temp;
        //         l1--;
        //         right--;
                
        //     }
        //     else if(nums2[l2-1]>= nums1[l1-1])
        //     {
        //         nums1[right]=nums2[l2-1];
        //         l2--;
        //         right--;
        //     }
        // }

        // while(l2>0)
        // {
        //      nums1[right]=nums2[l2-1];
        //      l2--;
        //      right--;
             
        // }

            // assing two pointer approach using left and rigth
        int l1=m-1,l2=n-1;  // left was using to check numbers which one is bigger
        int r=m+n-1; // rigth was using to store the number

        while(l1>=0 && l2>=0)  // Merge from the back while both arrays have elements left
        {
            if(nums1[l1]>nums2[l2])  // chcekcing the nums1 are greater then nums2
            {
                nums1[r]=nums1[l1];
                l1--;
            }
            else   // oppsite of the if condition
            {
                nums1[r]=nums2[l2];
                l2--;
            }
            r--;
        }
        while(l2>=0)  // adding the remaing numbers in nums2 array into nums1 
        {
            nums1[r]=nums2[l2];
            l2--;
            r--;
        }
    }
}
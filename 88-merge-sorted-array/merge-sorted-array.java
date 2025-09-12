class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
           if(m==1 && n==0)
           {
                nums1[0]=nums1[0];
           }
           if(n==1 && m==0)
           {
            nums1[0]=nums2[0];
           }


        int l1=m,l2=n;
        int right=nums1.length-1;

        while(l1>0 && l2>0)
        {
            if(nums1[l1-1] > nums2[l2-1])
            {
                int temp=nums1[right];
                nums1[right]=nums1[l1-1];
                nums1[l1-1]=temp;
                l1--;
                right--;
                
            }
            else if(nums2[l2-1]>= nums1[l1-1])
            {
                nums1[right]=nums2[l2-1];
                l2--;
                right--;
            }
        }
        // while( l1>0)
        // {
        //     if(nums1[l1-1] > nums2[l2-1])
        //     {
        //         int temp=nums1[l1-1];
        //         nums1[l1-1]=nums2[l2-1];
        //         nums2[l2-1]=temp;
        //         l1--;
        //     }
        // }

        while(l2>0)
        {
             nums1[right]=nums2[l2-1];
             l2--;
             right--;
             
        }
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        // we are using merge sort to combine two arrays
        int arr[]=new int [n+m];
        int k=0;
        for(int i=0;i<n;i++)
        {
            arr[k++]=nums1[i];
        }
        for(int i=0;i<m;i++)
        {
            arr[k++]=nums2[i];
        }
        Arrays.sort(arr);
        
        // finding the median
        int size=arr.length;
        if(size%2==1)
        {
            return (double) arr[size/2];
        }
        else
        {
            int n1=arr[size/2-1];
            int n2=arr[size/2];
            return ((double) n1+ (double) n2 )/2.0;
        }
    }
}
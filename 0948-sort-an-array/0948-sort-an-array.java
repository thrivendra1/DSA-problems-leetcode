class Solution {
    public int[] sortArray(int[] nums) 
    {
        divide(nums,0,nums.length-1);
        return nums;
    }
    public static void divide(int[] arr, int l, int r)
    {
//        if(si>=ei)
//        {
//            return;
//        }p
        if(l<r) {
            int m = (l + r) / 2;
            divide(arr, l, m);
            divide(arr, m + 1, r);
            merger(arr, l, m, r);
        }
    }

    private static void merger(int[] arr, int l, int mid, int r) {
        int n1=mid-l+1;
        int n2=r-mid;

        int larr[]=new int[n1];
        int rArr[]=new int [n2];

        for(int x=0;x<n1;x++)
        {
            larr[x]=arr[l+x];
        }
        for(int x=0;x<n2;x++)
        {
            rArr[x]=arr[mid+1+x];
        }
        int i=0;
        int j=0;
        int k=l;
        // write about this code in your notebook
        while (i<n1 && j<n2)
        {
            if(larr[i]<=rArr[j])
            {
                arr[k]=larr[i];
                i++;
                k++;
            }
            else {
                arr[k]=rArr[j];
                j++;
                k++;
            }
        }
        while(i<n1)
        {
            arr[k]=larr[i];
            i++;
            k++;
        }
        while (j<n2)
        {
            arr[k]=rArr[j];
            j++;
            k++;
        }

    }
}
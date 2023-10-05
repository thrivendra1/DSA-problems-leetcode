class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int j = m; j < m+n; j++) {
            nums1[j] = nums2[k];
            k++;
        }
        // Arrays.sort(nums1);

        // this is merge sort
         int n1=m+n;
        mergeSort(nums1,0,n1-1);
    }
    static void merge(int arr[], int l, int m, int r)
    {
        // Your code here
        int mid=m;
        // create a array to store the sorting array
        int meregearr[]=new int[r-l+1];
        int idx1=l;
        int idx2=mid+1;
        int x=0;
        // we checking to index values
        while(idx1<=mid && idx2<=r)
        {
            if(arr[idx1]<=arr[idx2])
            {
                meregearr[x++]=arr[idx1++];
            }
            else
            {
                meregearr[x++]=arr[idx2++];
            }
        }
        // checking first half arrAY
        while(idx1<=mid)
        {
            meregearr[x++]=arr[idx1++];
        }
        //checking second arrays
        while(idx2<=r)
        {
            meregearr[x++]=arr[idx2++];
        }
        for(int i=0,j=l;i<meregearr.length;i++,j++)
        {
            arr[j]=meregearr[i];
        }
    }
    static void mergeSort(int arr[], int l, int r)
    {
        //code here/
        // we checking l and r
        if(l>=r)
        {
            return;
        }
        // we getting mid values
        int mid=l+(r-l)/2;
        // divide the arrays in to single digit  & then sent it to merge function
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        // sent the start,mid,end index values and also arr
        merge(arr,l,mid,r);

    }
}
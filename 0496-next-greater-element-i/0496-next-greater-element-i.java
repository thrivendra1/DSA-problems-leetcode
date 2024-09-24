class Solution {
    static   public int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        int [] result=new int[nums1.length];

        boolean flag;
        for(int i=0;i<nums1.length;i++)
        {
            flag=false;
            for (int j = 0; j < nums2.length; j++)
            {
                if (nums1[i] == nums2[j] )
                {
                    for (int k = j + 1; k < nums2.length; k++)
                    {
                        if (nums2[k] > nums2[j])
                        {
                            result[i] = nums2[k];
                            flag = true;
                            break;

                        }
                    }
                    if(flag)
                    {
                        break;
                    }
                }
            }

            if(!flag)
            {
                result[i]=-1;

            }


        }
        return result;

    }
}
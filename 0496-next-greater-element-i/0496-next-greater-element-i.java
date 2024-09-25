class Solution {
  /*  //Apporach -1 
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
    */
        static   public int[] nextGreaterElement(int[] nums1, int[] nums2)
        {
            //hashmap to store a num2 digit and there next greater element 

            HashMap<Integer,Integer> map=new HashMap<>();

            // Stack , for using monotonic Decreasing order

            Stack<Integer> st=new Stack<>();

            for(int i=nums2.length-1;i>=0;i--)
            {
                // monotonic decreasing code

                while(!st.isEmpty() && st.peek()<=nums2[i])
                {
                    st.pop();
                }

                // storing nums2 data in stack

                if(!st.isEmpty())
                {
                    map.put(nums2[i],st.peek());
                }
                else
                {
                    map.put(nums2[i],-1);
                }
                st.push(nums2[i]);
            }

            int result[]=new int[nums1.length];

            for(int i=0;i<nums1.length;i++)
            {
                result[i]=map.get(nums1[i]);
            }
            return result;
        }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // int maxlength=0;
        // if(s.length()==1)
        // {
        //     return 1;
        // }
        // System.out.println(s.length()); 

        // for(int i=0;i<s.length();i++)
        // {
        //     HashSet<Character> set=new HashSet<>();

        //     for(int j=i;j<s.length();j++)
        //     {
        //         if(set.contains(s.charAt(j)))
        //         {
        //             maxlength=Math.max(maxlength,j-i);
        //             break;
        //         }
        //         set.add(s.charAt(j));
        //     }
        // }
        // return maxlength;
        String str=s;
         if(str.length()==0)
             return 0;
        int maxans = Integer.MIN_VALUE;
        Set < Character > set = new HashSet < > ();
        int l = 0;
        for (int r = 0; r < str.length(); r++) // outer loop for traversing the string
        {
            if (set.contains(str.charAt(r))) //if duplicate element is found
            {
                while (l < r && set.contains(str.charAt(r))) {
                    set.remove(str.charAt(l));
                    l++;
                }
            }
            set.add(str.charAt(r));
            maxans = Math.max(maxans, r - l + 1);
        }
        return maxans;
    }
}
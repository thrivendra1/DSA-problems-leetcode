class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        // time complexxciy was O(n^2);
        /*String st=ransomNote;
        char st1[]=magazine.toCharArray();
        boolean ans=false;
        // System.out.println("Given String -> " + st);
//        String remChar = st.replace("i", "");

        for(int i=0;i<st.length();i++)
        {
            for(int j=0;j<st1.length;j++)
            {
                if(st.charAt(i)==st1[j])
                {
                    ans=true;
                    char target=st1[j];
//                    st1=st1.replace(String.valueOf(target),"");
                    st1[j]='.';
                    break;
                }
                else {
                    ans=false;
                }

            }
            if(ans==false)
            {
                return false;
            }
        }
        return ans;
        */
        int count[]=new int[26];
        for(char c:magazine.toCharArray())
        {
            count[c-'a']++;
        }

        for(char c:ransomNote.toCharArray())
        {
            if(count[c-'a']==0)
            {
                return false;
            }
             count[c-'a']--;
        }
        return true;
        
    }
}
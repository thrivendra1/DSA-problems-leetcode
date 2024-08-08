class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        String st=ransomNote;
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
        
    }
}
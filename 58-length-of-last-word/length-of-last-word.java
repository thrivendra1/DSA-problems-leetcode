class Solution {
    public int lengthOfLastWord(String s) 
    {
        Stack<String> st=new Stack<>();
        // s=s.trim();
        String word="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                if(!word.isEmpty())
                {
                    st.push(word);
                    word="";
                }
            }
            else
            {
                word+=s.charAt(i);
            }
        }
        //  st.push(word);
        if(!word.isEmpty())
                {
                    st.push(word);
                    word="";
                }

        String result=st.pop();
        System.out.println(result);
        return result.length();
        
    }
}
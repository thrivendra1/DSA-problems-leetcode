class Solution {
    public boolean isPalindrome(String s) 
    {
        s=s.toLowerCase();
        // System.out.println(s);
        String word="";
         boolean result=true;
            if(s.isEmpty())
            {
                return true;
            }
            else
            {
           
                for(int i=0;i<s.length();i++)
                {
                    char c=s.charAt(i);
                    if(Character.isLetter(c) || Character.isDigit(c))
                    {
                    word+=c;
                    }
                }
            
            }
            int start=0;
            int end=word.length()-1;
            while(start<=end)
            {
                if(word.charAt(start)!=word.charAt(end))
                {
                    return false;
                }
                else
                {
                    start++;
                    end--;
                }
            }

            /*for(int i=0;i<word.length()/2;i++)
            {
                int size=word.length()-1;
                if(word.charAt(i)==word.charAt(size-i))
                {
                    // System.out.print(word.charAt(i));
                    result=true;
                }
                else
                {
                    result=false;
                }
            }
            */
        
        System.out.print(word.length());
        return result;
    }
}
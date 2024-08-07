class Solution {
    // public boolean isPalindrome(String s) 
    // {
    //     s=s.toLowerCase();
    //     // System.out.println(s);
    //     String word="";
    //      boolean result=true;
    //         if(s.isEmpty())
    //         {
    //             return true;
    //         }
    //         else
    //         {
           
    //             for(int i=0;i<s.length();i++)
    //             {
    //                 char c=s.charAt(i);
    //                 // if(Character.isLetter(c) || Character.isDigit(c))
    //                 // {
    //                 // word+=c;
    //                 // }
    //                 if(checking(c)) // we are not using any inbuilt fucnrions
    //             {
    //                 word+=c;
    //             }
    //             }
            
    //         }
    //         int start=0;
    //         int end=word.length()-1;
    //         while(start<=end)
    //         {
    //             if(word.charAt(start)!=word.charAt(end))
    //             {
    //                 return false;
    //             }
    //             else
    //             {
    //                 start++;
    //                 end--;
    //             }
    //         }

    //         /*for(int i=0;i<word.length()/2;i++)
    //         {
    //             int size=word.length()-1;
    //             if(word.charAt(i)==word.charAt(size-i))
    //             {
    //                 // System.out.print(word.charAt(i));
    //                 result=true;
    //             }
    //             else
    //             {
    //                 result=false;
    //             }
    //         }
    //         */
        
    //     System.out.print(word.length());
    //     return result;
    // }

    // static boolean checking(char ch)
    // {
    //     // 0
    //     if((ch>='a' && ch<='z') || (ch>='0' && ch<='9') )
    //     {
    //         return true;
    //     }
    //     return false;

    // }


// i don't use any inbuilt function the below code

// checking the letter was in the range or not
static boolean checking(char ch)
    {
        // 0
        if((ch>='a' && ch<='z') || (ch>='0' && ch<='9') )
        {
            return true;
        }

        return false;

    }

    //changing uppercase to lowercase

    static char lowercase(char ch)
    {
        if(ch>='A' && ch<='Z')
        {
            ch= (char) (ch-'A'+'a');
        }
        return ch;
    }
  static   public boolean isPalindrome(String s)
    {
//        s=s.toLowerCase();
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
                char ch=s.charAt(i);
                // changing letter to lowercase
                char c=lowercase(ch); // changing the word from uppercase to lowercase
                if(checking(c)) // cheking the the word was alphabets or digit
                {
                    word+=c;
                }
            }

        }

        // i am using two pointer 
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
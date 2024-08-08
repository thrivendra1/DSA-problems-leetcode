class Solution 
{
    static public String reverseVowels(String s)
    {

        Character ch[]=new Character[s.length()];

        String vowelsword="";
        for(int i=0;i<s.length();i++)
        {
            char c =s.charAt(i);
            if(vowel(c))
            {
                vowelsword+= String.valueOf(c);
                ch[i]=null;
            }
            else {
                ch[i]=c;
            }
        }
        // reversing the vowels word

        String reversed_vowels=reversing(vowelsword);
        int size=reversed_vowels.length();
        int k=0;
        String result="";
        for(int i=0;i<s.length();i++)
        {
            
            if(ch[i]==null)
            {
                ch[i]=reversed_vowels.charAt(k++);;
                
                
                // result+=m;
            }
            // else {
            //     result+=ch[i];
            // }
            result+=ch[i];

        }
//        =new String(Arrays.toString(ch));
        return result;
    }

    private static String reversing(String vowelsword)
    {
        String reversing_word="";
        for(int i=vowelsword.length()-1;i>=0;i--)
        {
            reversing_word+=vowelsword.charAt(i);
        }
        return reversing_word;
    }

    private static boolean vowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            return true;
        }
        return false;
    }
    
}
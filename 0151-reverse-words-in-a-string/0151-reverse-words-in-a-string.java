class Solution {
    public String reverseWords(String s) 
    {
        Stack<String> stack = new Stack<String>();
        String word="";
        // s=s.trim();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                if(!word.isEmpty())
                {
                    stack.push(word);
                    word="";
                }
            }
            else
            {
                word+=s.charAt(i);
            }
        }
        
        if(!word.isEmpty())
                {
                    stack.push(word);
                    
                }
        System.out.println(stack);
        // chaning stack to string
        StringBuilder string=new StringBuilder();

        while(!stack.isEmpty())
        {
            String name=stack.pop();
            
                string.append(name);
                if(!stack.isEmpty())
                {
                    string.append(" ");
                }
            
        }
        return string.toString();
        
    }
}
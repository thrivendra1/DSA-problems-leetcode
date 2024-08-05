class Solution {
    public String frequencySort(String s) {
        
        
        // storing the String in hashmap
        
        HashMap<Character,Integer> storing=new HashMap<>();
        
        for(char c:s.toCharArray())
        {
            if(storing.containsKey(c))  
            {
                storing.put(c,storing.get(c)+1);
            }
            else
            {
                storing.put(c,1);
            }
        }
        StringBuilder result=new StringBuilder();
        while(!storing.isEmpty())
        {
                  
            int max=0;
            char letter='a';
        for(Map.Entry<Character,Integer> e:storing.entrySet())
        {
            // System.out.println(e.getKey()+" "+e.getValue());
            
            
            if(e.getValue()>max)
            {
                max=e.getValue();
                letter=e.getKey();
            }
            
        }
            
            for(int i=0;i<max;i++)
            {
                result.append(letter);
            }
            storing.remove(letter);
        }
        return result.toString();
        
    }
}
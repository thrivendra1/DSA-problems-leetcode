class Solution {
    public boolean lemonadeChange(int[] bills) 
    {
        int fivebill=0;
        int tenbill=0;
        
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                fivebill++;
            }
            else if(bills[i]==10)
            {
                tenbill++;
                // int amount=bills[i];
                if(fivebill>0)
                {
                    fivebill--;
                }
                else
                {
                    return false;
                }
            }

            else if(bills[i]==20)
            {
                
                if(fivebill>0 && tenbill>0 )
                {
                    fivebill--;
                    tenbill--;
                }
                else if(fivebill>=3)
                {
                    fivebill-=3;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }

        
        return true;
        
    }
}
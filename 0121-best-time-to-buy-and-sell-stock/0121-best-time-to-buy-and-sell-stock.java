class Solution {
    public int maxProfit(int[] prices)
    {
        int buy=Integer.MAX_VALUE;
        int sell=0;
        for(int i=0;i<prices.length;i++)
        {
            // we using min beacase we want to buy stock in low price 
            buy=Math.min(buy,prices[i]);
            // we using max beacase we want to sell stock in max profit price 
            sell=Math.max(sell,prices[i]-buy);
        }
       return sell;
    }
}
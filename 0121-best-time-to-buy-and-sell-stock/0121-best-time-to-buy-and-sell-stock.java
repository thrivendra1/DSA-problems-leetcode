class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int sell=0;
        for(int a:prices)
        {
            buy=Math.min(buy,a);
            sell=Math.max(sell,a-buy);
        }
        return sell;
    }
}
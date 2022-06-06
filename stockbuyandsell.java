public class Solution {
    public int maxProfit(int[] prices) {
        int stock = Integer.MAX_VALUE;
        int profit = 0;
        
        for(int i = 0;i < prices.length;i++)
        {
            if(prices[i] < stock)
            {
                stock = prices[i];
            }
            else if(prices[i] - stock > profit)
            {
                profit = prices[i] - stock;
            }
        }
        
        return profit;
    }
}
    
}

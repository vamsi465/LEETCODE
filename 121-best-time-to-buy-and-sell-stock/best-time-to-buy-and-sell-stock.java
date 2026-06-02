class Solution {
    public int maxProfit(int[] prices) {
     int n=prices.length;
      int min=prices[0];
      int best_buy=0;
     for(int i=1;i<n;i++)
     {
        best_buy=Math.max(prices[i]-min,best_buy);
        min=Math.min(prices[i],min);
     }
     return best_buy; 
    }
}
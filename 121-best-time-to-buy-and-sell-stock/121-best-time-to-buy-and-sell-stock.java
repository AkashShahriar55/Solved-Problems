class Solution {
    public int maxProfit(int[] prices) {
        
        int buy = 0;
        int profit = 0;
        
        for(int i = 0; i < prices.length;i++){
            if(i == 0){
                buy = prices[i];
                continue;
            }
            
            profit = Math.max(profit,prices[i]-buy);
            buy = Math.min(buy,prices[i]);
           
        }
        
        return profit;
    }
}
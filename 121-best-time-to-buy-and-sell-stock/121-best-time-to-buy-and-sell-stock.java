class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int profit = 0;
        int max_profit = 0;
        
        for(int i = 0; i<prices.length;i++){
           if(min_price>prices[i]){
               min_price = prices[i];
           }
            
            profit = prices[i] - min_price;
            if(profit>max_profit){
                max_profit = profit;
            }
            
           
        }
        
        
//         for(int i = 0; i<prices.length;i++){
//             min_price = Math.min(min_price,prices[i]);
//             max_profit = Math.max(prices[i] - min_price, max_profit);
//         }
        
//         return max_profit;
        
         return max_profit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int max_Profit = 0 ;
        int buy_Price = prices[0];
        for(int i = 1;i<prices.length;i++){
            int curr_Profit = prices[i]-buy_Price;
            if(curr_Profit > max_Profit){
                max_Profit = curr_Profit;
            }
            if(prices[i]<buy_Price){
                buy_Price = prices[i];
            }
        }
        return max_Profit;
        
    }
}
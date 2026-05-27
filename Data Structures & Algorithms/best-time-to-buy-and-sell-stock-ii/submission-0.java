class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0 , j = i+1 ; j<prices.length ; i++,j++){
            if(prices[i] < prices[j]){
                profit += prices[j] - prices[i];
            }
        }
        return profit;
    }
}
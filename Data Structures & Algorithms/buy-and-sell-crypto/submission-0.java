class Solution {
    public int maxProfit(int[] prices) {
        int l = 0 , r = 1 , maxP = 0;
        while(r < prices.length){
            if(prices[r] < prices[l]){
                l = r;
                r++;
            }
            else{
                maxP = Math.max( maxP , (prices[r] - prices[l]) );
                r++;
            }
        }
        return maxP;
    }
}

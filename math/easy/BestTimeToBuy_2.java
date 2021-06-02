class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int profit = 0;
        if(prices == null||length < 1){
            return 0;
        }
        for(int i = 1;i < length;i++){
            if(prices[i] - prices[i-1] > 0){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}

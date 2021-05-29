class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int profit = 0;
        int min = prices[0];
        if(prices == null || length < 1){
            return 0;
        }
        for(int i = 1;i < length;i++){
            profit = Math.max(profit, prices[i] - min);
            min = Math.min(prices[i], min);
        }
        return profit;
    }
}

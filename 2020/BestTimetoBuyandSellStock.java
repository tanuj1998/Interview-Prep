class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int[] dp = new int[prices.length];
        dp[0] = prices[0];

        for(int i = 1; i < prices.length; i++){
            dp[i] = Math.min(dp[i-1], prices[i]);
        }
        int profit = 0;
        for(int i=0; i < prices.length; i++){
            int temp = prices[i] - dp[i];
            if(temp > profit){
                profit = temp;
            }
        }
        return profit;
    }
}
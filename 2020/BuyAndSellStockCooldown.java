class Solution {
    public int maxProfit(int[] prices) {
        int sold = Integer.MIN_VALUE;
        int bought = Integer.MIN_VALUE;
        int cooldown = 0;
        
        for(int i = 0; i < prices.length; i++){
            int temp = sold;
            sold = bought+prices[i];
            bought = Math.max(bought,cooldown-prices[i]);
            cooldown = Math.max(cooldown,temp);
        }
        return Math.max(sold,cooldown);
    }
}
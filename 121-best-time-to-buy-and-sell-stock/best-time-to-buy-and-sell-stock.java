class Solution {
    public int maxProfit(int[] prices) {
        int bestPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            bestPrice = Math.min(bestPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - bestPrice);
        }

        return maxProfit;
    }
}
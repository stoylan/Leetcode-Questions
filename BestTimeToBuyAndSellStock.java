public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int currentBuyPrice = prices[0];
        int maxProfit = 0;
        for (int i=1;i<prices.length;i++){
            int profit = prices[i] - currentBuyPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            else if (prices[i] < currentBuyPrice) {
                currentBuyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}

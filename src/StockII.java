public class StockII {
    public static int maxProfit(int[] prices) {
        int i = 0;
        int min = prices[0];
        int max = prices[0];
        int maxProfit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            min = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            max = prices[i];
            maxProfit += max - min;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
    }
}

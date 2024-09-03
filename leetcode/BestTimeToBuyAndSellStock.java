package leetcode;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = new int[]{2, 4, 1};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (price < buyPrice) {
                buyPrice = price;
            } else if (price - buyPrice > profit) {
                profit = price - buyPrice;
            }
        }

        return profit;
    }
}

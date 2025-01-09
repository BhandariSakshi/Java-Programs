import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, bestBuy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > bestBuy) {
                maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
            }
            bestBuy = Math.min(bestBuy, prices[i]);
        }
        return maxProfit;
    }
}

public class BuySellStock {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int n = sobj.nextInt();


        int[] prices = new int[n];

        System.out.println("Enter the stock prices for each day: ");
        for (int i = 0; i < n; i++) 
        {
            prices[i] = sobj.nextInt();
        }

        Solution obj = new Solution();

        int result = obj.maxProfit(prices);
        System.out.println("The maximum profit is: " + result);

    }
}

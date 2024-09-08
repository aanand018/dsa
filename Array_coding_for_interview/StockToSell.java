package Array_coding_for_interview;

public class StockToSell {

    public static void main(String[] args) {

        int[] prices = {5, 1, 2, 4, 6, 10};
        int maxProfit = 0;
        for( int i = 0; i < prices.length; i++ ){
            for( int j = prices.length-1; j > i; j-- ){
                int difference = prices[j] - prices[i];
                if( difference > maxProfit ){
                    maxProfit = difference;
                }
            }
        }
        System.out.println("Maximum Profit: " + maxProfit);
    }
}

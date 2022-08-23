package Week_1;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args){
        int[] testcase1 = {7,1,5,3,6,4};    // Output - 5
        int[] testcase2 = {7,6,4,3,1};      // Output = 0
        System.out.println(maxProfitdp(testcase1));
        System.out.println(maxProfit(testcase2));

    }

    private static int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
         int maxprofit = 0;
         for(int i=0;i<prices.length;i++){
             if(prices[i]<minprice){
                 minprice = prices[i];
             }else if(prices[i]-minprice >maxprofit){
                 maxprofit = prices[i]-minprice;
             }
         }
         return maxprofit;
    }

    private static int maxProfitdp(int[] prices) {
        int[] dp = new int[prices.length];
        dp[0] = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min( min, prices[i]);
            dp[i] = Math.max( dp[i-1],  prices[i] - min );
        }
        return dp[prices.length - 1];
    }
}

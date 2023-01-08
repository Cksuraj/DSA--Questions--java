import java.util.Arrays;

// Input: prices = [7,1,5,3,6,4]
// Output: 7
// Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
// Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
// Total profit is 4 + 3 = 7.

// using dynamic programming
public class buystock2 {
    static int foundmax(int i, int k , int dp[][], int stockprices[]){
        if(i==stockprices.length){
            return 0;
        }
        if(dp[i][k] !=-1){
            return dp[i][k];
        }
        int profit =0;
        if(k==1){
            int buy=-stockprices[i]+foundmax(i+1, 0, dp, stockprices);
            int notbuy= foundmax(i+1, 1, dp, stockprices);
            profit =Math.max(notbuy,buy);
        }
        else{
            int sell= stockprices[i]+foundmax(i+1, 1, dp, stockprices);
            int notsell=foundmax(i+1,0, dp, stockprices);
            profit = Math.max(sell,notsell);
        }
        return dp[i][k]=profit;
    }
    public static int maxprofit(int stockprices[]){
        int n=stockprices.length;
        int dp[][]=new int [n][2];
        for(int[] row:dp)
            Arrays.fill(row, -1);
        return foundmax(0, 1, dp, stockprices);
    }

    public static int maxporfit(int stockprices[]){
        int buy = Integer.MAX_VALUE;
         int sellporfit=0;
         for(int i=0; i<stockprices.length;i++){
            if(buy<stockprices[i]){
                int sell=stockprices[i]-buy;
                sellporfit=Math.max(sellporfit,sell);
            }
            else{
                buy =stockprices[i];
            }
         }return sellporfit;
    }
    
    public static int Profitmax(int[] stockprices) {
        int maxprofit = 0;
        for (int i = 1; i < stockprices.length; i++) {
            if (stockprices[i] > stockprices[i - 1])
                maxprofit += stockprices[i] - stockprices[i - 1];
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int stockprices[]={7,1,5,3,6,4};
//        System.out.println(maxprofit(stockprices));
     System.out.println(Profitmax(stockprices));  
// System.out.print(maxporfit(stockprices));
    }
    
}

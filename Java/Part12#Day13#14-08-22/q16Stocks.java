public class q16Stocks {

    //Functions
    public static int buyAndSellStocks(int prices[]) {

        int buyPrice = Integer.MAX_VALUE; //variables
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) { //loop

            if(buyPrice < prices[i]){

                int profit = prices[i] - buyPrice; 
                maxProfit = Math.max(maxProfit, profit);

            }else{
                buyPrice = prices[i];
            }
        }

        return maxProfit; //output

    }
    
    //Main
    public static void main(String args[]){

        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println(buyAndSellStocks(prices));
    }

}

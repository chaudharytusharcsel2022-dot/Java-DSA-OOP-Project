public class stocks {
    public static int Stock_Sell_Buy(int sell_price[]) {
        int max_profit = 0;
        int buy_price = Integer.MAX_VALUE;  //  +INFINITY
          for (int i = 0; i < sell_price.length; i++) {
           
            if (sell_price[i] >buy_price) {
         int profit = sell_price[i] - buy_price;
          max_profit = Math.max(max_profit, profit);
                          
            }
            else{
            buy_price = sell_price[i];
            }
           }
           return max_profit;
    
        }
    public static void main(String[] args) {
        int sell_price[]= { 7,1,5,3,6,4};
        System.out.println(Stock_Sell_Buy(sell_price));
      
    }
}

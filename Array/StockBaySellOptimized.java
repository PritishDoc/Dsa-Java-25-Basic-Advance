public class StockBaySellOptimized {
    static int stocksell(int price[]){
        int profit=0;
        for(int i=1;i<price.length;i++){
            if(price[i]>price[i-1]){
                profit+=(price[i]-price[i-1]);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int price[]={1,5,3,8,12};
        System.out.println(stocksell(price));
    }
}

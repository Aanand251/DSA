class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minprice = prices[0];
        int maxprofit = 0;
        int profit = 0;

        for(int price = 1 ; price<n; price ++){
            if(prices[price] < minprice){
                minprice = prices[price];
            }
            profit =  prices[price] - minprice;
            if (profit>maxprofit){
                maxprofit = profit;
           }
            
        }
        return maxprofit;
        
    }
}
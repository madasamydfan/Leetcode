class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int minProfit = 0;
        for(int i:prices){
            minPrice = Math.min(minPrice,i);
            minProfit = Math.max(minProfit,i-minPrice);
        }
        return minProfit;
    }
}
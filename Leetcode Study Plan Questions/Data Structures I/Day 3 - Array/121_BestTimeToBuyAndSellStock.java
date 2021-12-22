class Solution {
    public int maxProfit(int[] prices) {
        // //brute force ; TC - O(n^2), SC - O(1)
        // int profit = Integer.MIN_VALUE;
        // int max_profit = Integer.MIN_VALUE;
        // for (int i=0; i<prices.length-1; i++){
        //     for (int j=i+1; j<prices.length; j++){
        //         if (prices[i] < prices[j]){
        //             profit = prices[j] - prices[i];
        //             if (profit > max_profit) max_profit = profit;
        //         }
        //     }
        // }
        // if (max_profit == Integer.MIN_VALUE) return 0;
        // return max_profit;
        
        
        //Efficient approach - TC - O(n) ; SC - O(1)
        int minSoFar = prices[0];
        int max = 0;
        for (int i=0; i<prices.length; i++){
            if (prices[i] > minSoFar) {
                max = Math.max(max, prices[i]-minSoFar);
            }
            else minSoFar = prices[i];
        }
        return max;   
        
        //Kadane's algorithm
        // int currMax=0, maxSoFar = 0;
        // for (int i=1; i<prices.length; i++){
        //     currMax += prices[i]-prices[i-1];
        //     currMax = Math.max(0, currMax);
        //     maxSoFar = Math.max(currMax,maxSoFar);
        // }
        // return maxSoFar;
    }
}
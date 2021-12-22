class Solution {
    public int maxSubArray(int[] nums) {
        // Using Kadane's algorithm
        //base case
        if (nums.length == 1) return nums[0];
        int currSubArraySum = nums[0];
        int maxSubArraySum = nums[0];
        
        for (int i=1; i<nums.length; i++){
            if (currSubArraySum < 0){
                currSubArraySum = 0;
            }
            currSubArraySum += nums[i];
            if (currSubArraySum > maxSubArraySum) maxSubArraySum = currSubArraySum;
        }
        return maxSubArraySum;      
    }
}
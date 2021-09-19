class Solution {
    public int[] sortedSquares(int[] nums) {
        //Total TC - O(nlog n)
        //For squaring each element => TC - O(n)
        // for (int i=0; i<nums.length; i++){
        //     nums[i] *= nums[i];
        // }
        // //Quick Sort => TC - O(nlog n) 
        // Arrays.sort(nums);
        // return nums;
        
        //Faster approach (Two pointers)=> TC - O(n)
        int[] res = new int[nums.length];
        int i=0, j=nums.length-1;
        for (int p=nums.length-1; p>=0; p--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[p] = nums[i] * nums[i];
                i++;
            }
            else {
                res[p] = nums[j] * nums[j];
                j--;
            }
        }
        return res;
    }
}
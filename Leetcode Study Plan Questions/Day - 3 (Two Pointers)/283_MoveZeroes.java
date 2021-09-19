class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        for (int num : nums){
            if (num != 0){
                nums[pos] = num;
                pos++;
            }
        }
        
        while (nums.length-pos > 0){
            nums[pos] = 0;
            pos++;
        }
    }
}
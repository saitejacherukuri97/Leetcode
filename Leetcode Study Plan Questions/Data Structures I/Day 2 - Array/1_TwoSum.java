class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Brute force => TC - O(n^2), SC - O(1)
//         for (int i=0; i<nums.length-1; i++){
//             for (int j=i+1; j<nums.length; j++){
//                 int sum = nums[i] + nums[j];
//                 if (sum == target) return new int[]{i,j};
//             }   
//         }
        
//         return new int[2];
            
        //Single Iteration => TC - O(n) , SC - O(n)
        HashMap<Integer,Integer> map = new HashMap<>();
        //O(n)
        for (int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            map.put(diff, i);
        }
        
        //O(n)
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i]) && i!=map.get(nums[i])) 
                   return new int[]{i,map.get(nums[i])};
        }
        return new int[2];
    }   
}
    
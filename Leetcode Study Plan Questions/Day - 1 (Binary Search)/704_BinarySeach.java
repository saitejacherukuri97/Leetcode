class Solution {
    public int search(int[] nums, int target) {
        //Bruteforce => TC - O(n), SC - O(1)
        // for (int i=0; i<nums.length; i++){
        //     if (target == nums[i]) return i;
        // }
        // return -1;
        
        //Binary search using recursion => TC - O(log n), SC - O(1)
//         int low=0, high=nums.length-1;
        
//         while(low < high){
//             int mid = low + (int)((high-low+1)/2);
//             if(target == nums[mid]) return mid;
//             else if (target < nums[mid]){
//                 high = mid - 1;
//             }
//             else low = mid;
//         }
//         return -1;
        
        
        int start=0;
        int end = nums.length-1;
        
        while(start<=end)
        {
            int mid=(start+end)/2;
            
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
                
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
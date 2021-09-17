class Solution {
    public int searchInsert(int[] nums, int target) {
        //bruteforce => TC - O(n), SC - O(1)
        // int lo=0, hi=0;
        // if (target < nums[0]) return 0;
        // for (int i=0; i<nums.length; i++){
        //     if (nums[i] == target) return i;
        //     if (nums[i]<target) lo=i;
        // }
        // return lo+1;       
        
        //Binary search => TC - O(log n), SC - O(1)
        int lo=0, hi=nums.length-1;
        while(lo<=hi){
            int mid = (int)((lo + hi)/2);
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]){
                hi = mid-1;
            }
            else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
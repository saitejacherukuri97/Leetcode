/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    
    //O(n) solution
    // for (let i=0; i<nums.length; i++){
    //     if (nums[i]==target || nums[i] > target) return i;
    // }
    // return nums.length;
    
    
    //O(log n) solution
    var low = 0;
    var high = nums.length-1;
    
    while(low <= high){
        var mid = Math.floor((low+high)/2);
        
        if (nums[mid] == target) return mid;
        else if (target > nums[mid]) low = mid + 1;
        else high = mid - 1; 
    }
    
    return low;
        
};
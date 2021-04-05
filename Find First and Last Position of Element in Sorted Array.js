/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function(nums, target) {
    
    //O(n) runtime
//     var res = [];
//     for (let i=0; i<nums.length; i++){
//         if (nums[i] == target){
//             res.push(i);
//             break;
//         } 
//     }
    
//     if (res.length==0) return [-1,-1];
    
//     for (let j=nums.length-1; j>=0; j--){
//         if (nums[j]==target){
//             res.push(j);
//             break;
//         } 
//     }
    
//     return res;
    
    //using IndexOf in JS -> O(n) runtime
    // return [nums.indexOf(target), nums.lastIndexOf(target)];
    
    //O(log n) runtime using Binary search
    var res = [];
    var low = 0;
    var high = nums.length-1;    
    
    //Searching for first index
    while (low <= high){
        var mid = Math.floor((low + high)/2);
        if (target <= nums[mid]) high = mid - 1;
        else low = mid + 1;
    }

    if (nums[low] !== target) return [-1,-1];
    
    var start = low;
    
    //reset low and high
    low = 0; high = nums.length-1;
    
    //Searching for Last Index
    while (low <= high){
        var mid = Math.floor((low + high)/2);
        if (target >= nums[mid]) low = mid + 1;
        else high = mid - 1;
    }
    
    return [start, high];
    
};
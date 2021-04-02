/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    var obj = {};
    var check = Math.floor(nums.length/2);
    
    for (let i=0; i<nums.length; i++){
        obj[nums[i]] = (obj[nums[i]]) ? (obj[nums[i]] + 1) : 1 ; //O(n)
        if (obj[nums[i]] > check) return nums[i];
    }
    
};
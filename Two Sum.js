/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    var res = [];
    
    // Brute force solution -> O(n^2)
    // for (let i=0; i<nums.length-1; i++){
    //     for (let j=i+1; j<nums.length; j++){
    //         if (nums[i]+nums[j]==target) {
    //             res.push(i, j); 
    //             break;
    //         }
    //     }
    // }
    
    // hash map solution
  /*  var map = {};
    
    for (let i=0; i<nums.length; i++){
        var diff = target - nums[i];
        map[diff] = i;  // 3, 4, 2
    }
    
    for (let i=0; i<nums.length; i++){
        if (map[nums[i]]!=null && map[nums[i]]!=i){
            res.push(i, map[nums[i]]); // 7
            break;
        } 
    }
    
        return res;
   */
    
    //Faster solution using indexOf
    var dup_nums = [...nums];
    
    for (let i=0; i<nums.length; i++){
        var diff = target - nums[i];
        dup_nums[i]=null;
        const diff_index = dup_nums.indexOf(diff);
        if (diff_index > -1) return [i, diff_index];
    }
        
};
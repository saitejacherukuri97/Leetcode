/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) {
    var arr = [];
    while (head != null){
        arr.push(head.val);
        head = head.next;
    }
    
    for(let i=0, j=arr.length-1; i<Math.floor(arr.length/2),j>=0; i++,j--){
        if (arr[i]!=arr[j]) return false;
    }
    
    return true;
      
};